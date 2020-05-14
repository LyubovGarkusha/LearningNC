import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {QuizzesPanelViewComponent} from './modules/layout/components/quizzes-panel/quizzes-panel-view.component';
import {QuizEditViewComponent} from './modules/layout/components/quiz-edit/quiz-edit-view.component';
import {LoginComponent} from './modules/layout/components/login/login.component';


const appRoutes: Routes = [
  {path: 'quizzes', component: QuizzesPanelViewComponent},
  {path: 'quiz/:id', component: QuizEditViewComponent},
  {path: '',   redirectTo: '/quizzes', pathMatch: 'full' },
  {path: 'login', component: LoginComponent},
  // { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
