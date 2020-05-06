import {OnInit, Component} from '@angular/core';
import {Quiz} from '../../models/quiz';
import {Subscription} from 'rxjs';
import {QuizService} from '../../../../services/quiz.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-quiz-details',
  templateUrl: './quiz-details.component.html',
  styleUrls: ['./quiz-details.component.css']
})
export class QuizDetailsComponent implements OnInit {

  public editMode = false;
  public quiz = new Quiz();
  public quizzes: Quiz[];
  private subscriptions: Subscription[] = [];



  constructor(private quizService: QuizService,
              private activateRoute: ActivatedRoute,
              private router: Router) { }

  // Calls on component init
  ngOnInit() {
    this.loadQuizzes();
  }
  private loadQuizzes(): void {
    // Get data from QuizService
    this.subscriptions.push(this.quizService.getAllQuizzes().subscribe(quizzes => {
      // Parse json response into local array
      this.quizzes = quizzes as Quiz[];
      // Check data in console
      console.log(this.quizzes); // don't use console.log in angular :)
    }));  // --------------- подписка на событие
  }
  public _updateQuizList(): void {
    this.loadQuizzes();
  }
  public _deleteQuiz(quizId: string): void {
    this.subscriptions.push(this.quizService.deleteQuiz(quizId).subscribe(() => {
      this._updateQuizList();
    }));
  }

  public _addQuiz(): void {
    this.subscriptions.push(this.quizService.saveQuiz(this.quiz).subscribe(() => {
      this._updateQuizList();
    }));
  }



}
