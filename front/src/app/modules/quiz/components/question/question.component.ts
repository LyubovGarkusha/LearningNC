import {Component, Input, Output} from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {Question} from '../../models/question';
import {QType} from '../../../../enums/qType';
import {AnswerTemplate} from '../../models/answer-template';
import {QuizService} from '../../../../services/quiz.service';

/** @title Form field with label */
@Component({
  selector: 'app-question',
  templateUrl: 'question.component.html',
  styleUrls: ['question.component.css'],
})
export class QuestionComponent {
  @Input() question: Question;
  questionType = QType;
  options: FormGroup;
  hideRequiredControl = new FormControl(false);
  floatLabelControl = new FormControl('auto');

  constructor(fb: FormBuilder,
              private quizService: QuizService) {
    this.options = fb.group({
      hideRequired: this.hideRequiredControl,
      floatLabel: this.floatLabelControl
    });
  }

  radioChange(): void{
    this.question.answerTemplates = [];
    this.question.questionType = this.floatLabelControl.value;
    if (this.question.questionType !== this.questionType[0]) {
      this.question.answerTemplates.push(new AnswerTemplate());
    }
  }

  addAnswerTemplate(): void{
    this.question.answerTemplates.push(new AnswerTemplate());
  }

  deleteAnswer(i: number): void{
    this.question.answerTemplates.splice(i , 1);
  }

  nessesaryControl(): void{
    this.question.nessesary = this.hideRequiredControl.value;
  }

  seeQuestion(): void{
    console.log(this.question);
  }

  getReady(): void{
    if (this.floatLabelControl.value && this.question.description){
      if (this.floatLabelControl.value === this.questionType[0]){
        this.quizService.isReadyToSubmit = true;
      } else {
        if (this.question.answerTemplates.length > 0){
          this.quizService.isReadyToSubmit = true;
          this.question.answerTemplates.forEach(
            a => {
              if (!a.answerText) {
                this.quizService.isReadyToSubmit = false;
              }
            }
          );

        }
      }
    }
    console.log( this.quizService.isReadyToSubmit);

  }
}
