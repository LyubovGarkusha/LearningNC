import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import {StorageService} from '../../../services/storage.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(
    public storageService: StorageService,
    private router: Router) {
  }

  public logout(): void {
    this.storageService.clearToken();
    this.storageService.setCurrentUser(null);
  }

  ngOnInit(): void {
  }

}
