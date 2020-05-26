import {Component, OnInit, OnDestroy} from '@angular/core';
import {Login} from '../../models/login';
import {AuthToken, UserService} from '../../../../services/user.service';
import {StorageService} from '../../../../services/storage.service';
import {User} from '../../models/user';
import { Router } from '@angular/router';
import {Subscription} from 'rxjs';
import {Role} from '../../../../enums/role';
import {FormControl, Validators} from "@angular/forms";

@Component({
  selector: 'app-sign-up',
  styleUrls: ['./sign-up.component.css'],
  templateUrl: './sign-up.component.html'
})
export class SignUpComponent implements OnInit, OnDestroy {

  hide = true;
  public userModel: User = {role: Role.USER.toString(), login: {}, answerSubmittedList: [], quizList: []};
  public showCheckYourSetDataAlert = false;
  private subscription: Subscription[] = [];
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
    this.subscription.push(this.userService.signUpUser(this.userModel)
      .subscribe(
        arg => {
          this.userModel = arg;
          console.log(this.userModel);
        },
        (err) => { },
        () => {
          this.router.navigate(['/login']);
        }
      )
    );
  }

  public logout(): void {
    this.storageService.clearToken();
    this.storageService.setCurrentUser(null);
  }

  ngOnDestroy() {
    this.subscription.forEach(sub => sub.unsubscribe());
  }
}
