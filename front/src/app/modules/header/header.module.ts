import { NgModule } from '@angular/core';
import {HeaderComponent} from './components/header.component';
import {AppComponent} from '../../app.component';
import {RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {MatButtonToggleModule} from '@angular/material/button-toggle'

@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
    RouterModule,
    CommonModule,
    MatButtonToggleModule
   ],
  exports: [
    HeaderComponent
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppHeaderModule { }
