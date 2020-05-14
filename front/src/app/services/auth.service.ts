import {Injectable} from '@angular/core';
import {StorageService} from './storage.service';

@Injectable({providedIn: 'root'})
export class AuthService {

  constructor(private storageService: StorageService) {
  }

  public isAuthenticated(): boolean {
    const token = localStorage.getItem('token');
    // todo it would be better to add parsing toke. Check expiration!
    return token && token !== 'null' && !!this.storageService.getCurrentUser();
  }

}
