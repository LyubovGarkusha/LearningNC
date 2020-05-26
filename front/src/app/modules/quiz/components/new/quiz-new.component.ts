import {Component, OnDestroy, OnInit} from '@angular/core';
import {Quiz} from '../../models/quiz';
import {Subscription} from 'rxjs';
import {QuizService} from '../../../../services/quiz.service';
import {ActivatedRoute, Router} from '@angular/router';
import {User} from '../../../login/models/user';
import {FormArray, FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {Theme} from '../../../../enums/theme';
import {UserService} from '../../../../services/user.service';
import {Question} from '../../models/question';


@Component({
  selector: 'app-quiz-new',
  templateUrl: './quiz-new.component.html',
  styleUrls: ['./quiz-new.component.css']
})
export class QuizNewComponent implements OnInit, OnDestroy {

  user: User;
  quiz: Quiz;
  private subscriptions: Subscription[] = [];
  myForm: FormGroup;
  theme = Theme;
  index: number;

  constructor(private quizService: QuizService,
              private activateRoute: ActivatedRoute,
              private router: Router,
              private fb: FormBuilder,
              private userService: UserService) {

    this.quiz = new Quiz();
    this.quiz.questionList = [];
    this.myForm = new FormGroup({
      Name: new FormControl(),
      Theme: new FormControl(),
      questions: this.fb.array([])
    });
    this.setQuestions();
  }

  ngOnInit() {
    this.subscriptions.push(this.userService.getAuthorizedUser().subscribe(user => {
      this.user = user as User;
    }));
  }

  public goToQuizzes(): void {
    this.router.navigate(['/quizzes']);
  }

  public viewQuiz(): void {
    console.log(this.quiz);
    console.log(this.quizService.isReadyToSubmit);
  }

  public setQuestions() {
    const control = this.myForm.controls.questions as FormArray;
    this.quiz.questionList.forEach(x => {
      control.push(this.fb.group({
        question: x,
        answers: this.setAnswers(x) }));
    });
  }

  public setAnswers(x){
    const arr = new FormArray([]);
    x.answerTemplates.forEach(y => {
      arr.push(this.fb.group({
        answer: y.answerText
      }));
    });
    return arr;
  }


  public addQuestion(){
    const control = this.myForm.controls.questions as FormArray;
    control.push(
      this.fb.group({
        question: [''],
        type: [''],
        nessesary: [''],
        answers: this.fb.array([])
      })
    );
    this.quiz.questionList.push(new Question());
  }

  public deleteQuestion(index){
    const control = this.myForm.controls.questions as FormArray;
    control.removeAt(index);
  }

  public deleteAnswer(control, index){
    control.removeAt(index);
  }

  public onSubmit(): void {
    this.quizService.saveQuiz(this.quiz);
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(subscription => subscription.unsubscribe());
  }


}
