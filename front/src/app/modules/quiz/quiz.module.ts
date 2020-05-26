import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {BrowserModule} from '@angular/platform-browser';
import {RouterModule} from '@angular/router';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import {QuizService} from '../../services/quiz.service';
import {QuizDetailsComponent} from './components/details/quiz-details.component';
import {QuizEditComponent} from './components/edit/quiz-edit.component';
import {QuizNewComponent} from './components/new/quiz-new.component';
import {UserService} from '../../services/user.service';
import {MatTabsModule} from '@angular/material/tabs';
import {MatIconModule} from '@angular/material/icon';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {QuestionComponent} from './components/question/question.component';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatRadioModule} from '@angular/material/radio';


@NgModule({
  declarations: [
    QuizDetailsComponent,
    QuizEditComponent,
    QuizNewComponent,
    QuestionComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    MatTabsModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatCheckboxModule,
    MatRadioModule
  ],

  providers: [
    QuizService,
    UserService
  ],
  exports: [
    QuizDetailsComponent,
    QuizEditComponent,
    QuizNewComponent,
    QuestionComponent
  ]
})
export class QuizModule {
}
