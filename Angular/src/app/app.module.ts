import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SideBarComponent } from './_comp/side-bar/side-bar.component';
import { ProductDetailsComponent } from './_comp/product-details/product-details.component';
import { HomeComponent } from './_comp/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    SideBarComponent,
    ProductDetailsComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
