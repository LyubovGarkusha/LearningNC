import {Question} from './question';
import {AnswerSubmitted} from './answer-submitted';

export class AnswerTemplate{
  id?: string;
  answerText: string;
  answerSubmittedList?: AnswerSubmitted[];
}
