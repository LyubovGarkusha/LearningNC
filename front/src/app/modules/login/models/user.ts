
import {Login} from './login';
import {Quiz} from '../../quiz/models/quiz';
import {AnswerSubmitted} from '../../quiz/models/answer-submitted';
import {Role} from '../../../enums/role';


export class User {
  id?: string;
  role: string;
  name?: boolean;
  login?: Login;
  quizList?: Quiz[];
  answerSubmittedList?: AnswerSubmitted[];
}
