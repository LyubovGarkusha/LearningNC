import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Quiz} from '../modules/quiz/models/quiz';

@Injectable()
// Data service
export class QuizService {

  constructor(private http: HttpClient) {
  }

  getAllQuizzes(): Observable<Quiz[]> {
    return this.http.get<Quiz[]>('/api/quiz/all');
  }
  deleteQuiz(quizId: string): Observable<void> {
    return this.http.delete<void>('/api/quiz/all/' + quizId);
  }

  saveQuiz(quiz: Quiz): Observable<Quiz> {
    return this.http.post<Quiz>('/api/quiz/all', quiz);
  }

}
