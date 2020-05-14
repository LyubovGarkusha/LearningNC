import {Component, OnInit} from '@angular/core';
import {Quiz} from '../../models/quiz';
import {Subscription} from 'rxjs';
import {QuizService} from '../../../../services/quiz.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-quiz-edit',
  templateUrl: './quiz-edit.component.html',
  styleUrls: ['./quiz-edit.component.css']
})
export class QuizEditComponent implements OnInit {

  quiz: Quiz;
  private subscriptions: Subscription[] = [];
  isReady = false;
  editMode = false;

  constructor(private quizService: QuizService,
              private activateRoute: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit() {
    const id = this.activateRoute.snapshot.params.id;

    if (id) {

      this.subscriptions.push(this.quizService.getQuizById(id).subscribe(quiz => {
        this.isReady = true;
        this.quiz = quiz;
        console.log(this.quiz);
        },
        error => {
           this.router.navigate(['/quizzes'], {});
           console.log('quiz read error'); // добавить обработку страниц
        }));
    } else {
      this.router.navigate(['/quizzes'], {});
      console.log('quiz route error');
    }
  }

  public goToQuizzes(): void{
    this.router.navigate(['/quizzes']);
  }

  public goEdit(): void{
    this.editMode = !this.editMode;
  }
  // ngOnDestroy(): void {
  //   this.subscriptions.forEach(subscription => subscription.unsubscribe());
  // }


}
