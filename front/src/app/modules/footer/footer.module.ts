import { NgModule } from '@angular/core';
import {FooterComponent} from './components/footer.component';
import {AppComponent} from '../../app.component';


@NgModule({
  declarations: [
    FooterComponent
  ],
  imports: [
  ],
  exports: [
    FooterComponent
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppFooterModule { }
