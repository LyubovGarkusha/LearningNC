import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {QuizzesPanelViewComponent} from './components/quizzes-panel/quizzes-panel-view.component';
import {QuizModule} from '../quiz/quiz.module';
import {AppFooterModule} from '../footer/footer.module';
import {AppHeaderModule} from '../header/header.module';

@NgModule({
  declarations: [
    QuizzesPanelViewComponent
  ],
  imports: [
    QuizModule,
    AppHeaderModule,
    AppFooterModule,
    QuizModule,
    RouterModule
  ],
  providers: [],
  exports: [
    QuizzesPanelViewComponent
  ]
})
export class LayoutModule {}
