import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductDetailsComponent } from './_comp/product-details/product-details.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path:'category/:cid', component: ProductDetailsComponent},
  {path:'', component: HomeComponent  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
