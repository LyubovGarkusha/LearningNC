import {OnInit, Component} from '@angular/core';
import {Quiz} from '../../models/quiz';
import {Subscription} from 'rxjs';
import {QuizService} from '../../../../services/quiz.service';
import {ActivatedRoute, Router} from '@angular/router';
import {User} from '../../../login/models/user';
import {UserService} from '../../../../services/user.service';
import {Role} from '../../../../enums/role';
import {StorageService} from '../../../../services/storage.service';

@Component({
  selector: 'app-quiz-details',
  templateUrl: './quiz-details.component.html',
  styleUrls: ['./quiz-details.component.css']
})
export class QuizDetailsComponent implements OnInit {

  public editMode = false;
  public quiz = new Quiz();
  public allQuizzes: Quiz[];
  public userQuizzes: Quiz[];
  private subscriptions: Subscription[] = [];
  private currentUser: User ;
  public role = Role;

  constructor(private quizService: QuizService,
              private router: Router,
              private storageService: StorageService,
              private userService: UserService) {
    this.currentUser = this.storageService.getCurrentUser();
  }

  ngOnInit() {
    this.loadQuizzes();
  }


  private loadQuizzes(): void {
    this.subscriptions.push(this.userService.getAuthorizedUser().subscribe(user => {
      this.currentUser = user as User;
      this.userQuizzes = user.quizList as Quiz[];
    }));
  }

  private loadAllQuizzes(): void {
    this.subscriptions.push(this.quizService.getAllQuizzes().subscribe(quizzes => {
      this.allQuizzes = quizzes as Quiz[];
    }));
  }

  public _updateQuizList(): void {
    this.loadAllQuizzes();
    this.loadQuizzes();
  }
  public _deleteQuiz(quizId: string): void {
    this.subscriptions.push(this.quizService.deleteQuiz(quizId).subscribe(() => {
      this._updateQuizList();
    }));
  }

  public _addQuiz(): void {
    console.log('_addquiz');
    this.subscriptions.push(this.quizService.saveQuiz(this.quiz).subscribe(() => {
      this._updateQuizList();
    }));
  }

  public goQuizEdit(id: string): void{
    console.log('goQuizEdit');
    this.router.navigate(['quiz/' + id]);
  }

  public goToNewQuiz(): void{
    this.router.navigate(['/quizzes/new']);
  }
}
