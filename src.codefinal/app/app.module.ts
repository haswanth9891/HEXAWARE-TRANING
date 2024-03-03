import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetbynameComponent } from './getbyname/getbyname.component';
import { GetbyroleComponent } from './getbyrole/getbyrole.component';
import { HttpClientModule } from '@angular/common/http';
import { GetallComponent } from './getall/getall.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    GetbynameComponent,
    GetbyroleComponent,
    GetallComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
