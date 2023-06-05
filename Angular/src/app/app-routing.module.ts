import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './_comp/home/home.component';
import { ProductDetailsComponent } from './_comp/product-details/product-details.component';

const routes: Routes = [
  {path:"category/:id", component:ProductDetailsComponent},  
  {path:"home", component:HomeComponent},
  {path:"", component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
