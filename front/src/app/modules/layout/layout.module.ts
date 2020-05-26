import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {QuizzesPanelViewComponent} from './components/quizzes-panel/quizzes-panel-view.component';
import {QuizModule} from '../quiz/quiz.module';
import {AppFooterModule} from '../footer/footer.module';
import {AppHeaderModule} from '../header/header.module';
import {QuizEditViewComponent} from './components/quiz-edit/quiz-edit-view.component';
import {LoginComponent} from './components/login/login.component';
import {LoginModule} from '../login/login.module';
import {SignUpViewComponent} from './components/sign-up/sign-up-view.component';
import {QuizNewViewComponent} from './components/quiz-new/quiz-new-view.component';

@NgModule({
  declarations: [
    QuizzesPanelViewComponent,
    QuizEditViewComponent,
    LoginComponent,
    SignUpViewComponent,
    QuizNewViewComponent
  ],
  imports: [
    QuizModule,
    AppHeaderModule,
    AppFooterModule,
    LoginModule,
    RouterModule
  ],
  providers: [],
  exports: [
    QuizzesPanelViewComponent,
    QuizEditViewComponent,
    LoginComponent,
    SignUpViewComponent,
    QuizNewViewComponent
  ]
})
export class LayoutModule {}
