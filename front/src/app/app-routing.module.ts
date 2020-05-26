import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {QuizzesPanelViewComponent} from './modules/layout/components/quizzes-panel/quizzes-panel-view.component';
import {QuizEditViewComponent} from './modules/layout/components/quiz-edit/quiz-edit-view.component';
import {LoginComponent} from './modules/layout/components/login/login.component';
import {SignUpViewComponent} from './modules/layout/components/sign-up/sign-up-view.component';
import {QuizNewViewComponent} from './modules/layout/components/quiz-new/quiz-new-view.component';


const appRoutes: Routes = [
  {path: 'quizzes', component: QuizzesPanelViewComponent},
  {path: 'quiz/:id', component: QuizEditViewComponent},
  {path: 'quizzes/new', component: QuizNewViewComponent, pathMatch: 'full'},
  {path: '',   redirectTo: 'login', pathMatch: 'full' },
  {path: 'login', component: LoginComponent},
  {path: 'signup', component: SignUpViewComponent},
  // { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
