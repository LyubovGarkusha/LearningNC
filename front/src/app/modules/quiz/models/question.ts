import {Quiz} from './quiz';
import {AnswerTemplate} from './answer-template';
import {AnswerSubmitted} from './answer-submitted';

export class Question{
  id?: string;
  description: string;
  questionType: string;
  nessesary: boolean;
  answerTemplates?: AnswerTemplate[];
  answerSubmittedList?: AnswerSubmitted[];
}
