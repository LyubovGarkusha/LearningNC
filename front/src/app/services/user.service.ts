import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Login} from '../modules/login/models/login';
import {User} from '../modules/login/models/user';

@Injectable()
export class UserService {

  constructor(private http: HttpClient) {
  }

  public generateToken(login: Login): Observable<AuthToken> {
    return this.http.post<AuthToken>('/api/token/generate-token', login);
  }

  public getAuthorizedUser(): Observable<User> {
    return this.http.get<User>('/api/user/current');
  }

}

export interface AuthToken {
  readonly token: string;
}
