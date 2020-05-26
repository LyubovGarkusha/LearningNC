import {User} from '../../login/models/user';
import {Question} from './question';
import {AnswerSubmitted} from './answer-submitted';


export class Quiz {
  id?: string;
  url?: string;
  quizName: string;
  shared: boolean;
  timer: string;
  creationDate?: string;
  lastModifyDate?: string;
  quizTheme: string;
  questionList: Question[];
  answerSubmittedList?: AnswerSubmitted[];
}


