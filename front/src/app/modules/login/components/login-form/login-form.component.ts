import {Component, OnInit} from '@angular/core';
import {Login} from '../../models/login';
import {AuthToken, UserService} from '../../../../services/user.service';
import {StorageService} from '../../../../services/storage.service';
import {User} from '../../models/user';

@Component({
  selector: 'app-login-form',
  styleUrls: ['./login-form.component.css'],
  templateUrl: './login-form.component.html'
})
export class LoginFormComponent implements OnInit {

  public loginModel: Login = {};
  public showCheckYourSetDataAlert = false;

  constructor(public storageService: StorageService,
              public userService: UserService) {
  }

  ngOnInit() {
  }

  public onSubmit(): void {
    this.userService.generateToken(this.loginModel)
      .subscribe((authToken: AuthToken) => {
        if (authToken.token) {
          this.storageService.setToken(authToken.token);
          this.userService.getAuthorizedUser()
            .subscribe((userModel: User) => {
              this.storageService.setCurrentUser(userModel);
            });
        }
      }, (error) => {
        if (error.status === 401) {
          this.showCheckYourSetDataAlert = true;
        } else {
          alert(error.message);
        }
      });

  }

  public logout(): void {
    this.storageService.clearToken();
    this.storageService.setCurrentUser(null);
  }

}
