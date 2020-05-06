import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HeaderComponent} from './components/header.component';
import {AppComponent} from '../../app.component';


@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
   ],
  exports: [
    HeaderComponent
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppHeaderModule { }
