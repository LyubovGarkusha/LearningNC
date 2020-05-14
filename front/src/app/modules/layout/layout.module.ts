import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {QuizzesPanelViewComponent} from './components/quizzes-panel/quizzes-panel-view.component';
import {QuizModule} from '../quiz/quiz.module';
import {AppFooterModule} from '../footer/footer.module';
import {AppHeaderModule} from '../header/header.module';
import {QuizEditViewComponent} from './components/quiz-edit/quiz-edit-view.component';
import {LoginComponent} from './components/login/login.component';
import {LoginModule} from '../login/login.module';

@NgModule({
  declarations: [
    QuizzesPanelViewComponent,
    QuizEditViewComponent,
    LoginComponent
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
    LoginComponent
  ]
})
export class LayoutModule {}
