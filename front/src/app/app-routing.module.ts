import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {QuizzesPanelViewComponent} from './modules/layout/components/quizzes-panel/quizzes-panel-view.component';


const appRoutes: Routes = [
  {path: 'quizzes', component: QuizzesPanelViewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
