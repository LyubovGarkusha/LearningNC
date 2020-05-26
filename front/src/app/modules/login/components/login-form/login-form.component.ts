import {Component, Input, OnInit} from '@angular/core';
import {Login} from '../../models/login';
import {AuthToken, UserService} from '../../../../services/user.service';
import {StorageService} from '../../../../services/storage.service';
import {User} from '../../models/user';
import {Router} from '@angular/router';
import {FormControl, FormGroup, FormGroupDirective, NgForm, Validators} from '@angular/forms';
import {ErrorStateMatcher} from '@angular/material/core';



@Component({
  selector: 'app-login-form',
  styleUrls: ['./login-form.component.css'],
  templateUrl: './login-form.component.html'
})
export class LoginFormComponent implements OnInit {

  hide = true;
  public loginModel: Login = {};
  public showCheckYourSetDataAlert = false;
  email = new FormControl('', [Validators.required, Validators.email]);

  constructor(public storageService: StorageService,
              public userService: UserService,
              private router: Router) {
  }

  ngOnInit() {
  }

  getErrorMessage() {
    if (this.email.hasError('required')) {
      return 'You must enter a value';
    }

    return this.email.hasError('email') ? 'Not a valid email' : '';
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
  public goToQuizzes(): void {
    this.router.navigate(['/quizzes']);
  }

}
