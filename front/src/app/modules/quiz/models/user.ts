import {Quiz} from './quiz';

export class User {
  id: string;
  role: string;
  name: boolean;
  login: Login; // -----
  quizList: Quiz[];
  answerSubmittedList: any; // -----
}
