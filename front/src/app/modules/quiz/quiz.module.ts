import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {BrowserModule} from '@angular/platform-browser';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {QuizService} from '../../services/quiz.service';
import {QuizDetailsComponent} from './components/details/quiz-details.component';
import {QuizEditComponent} from './components/edit/quiz-edit.component';

@NgModule({
  declarations: [
    QuizDetailsComponent,
    QuizEditComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    RouterModule,
    FormsModule,
  ],

  providers: [
    QuizService
  ],
  exports: [
    QuizDetailsComponent,
    QuizEditComponent
  ]
})
export class QuizModule {
}
