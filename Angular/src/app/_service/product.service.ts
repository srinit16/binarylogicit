import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Item } from '../_model/item';
import { ItemCategory } from '../_model/item-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
 
  baseURL="http://localhost:5000/api/products";
  constructor(private http:HttpClient) { 

  }

  public getProduct(cid:number): Observable<Item[]>{
    const url= this.baseURL + "/findByCategory?id="+cid;
  //  console.log(url);
    return this.http.get<Item[]>(url);
  }

  public getProductCategory():Observable<ItemCategory[]>{
    const url= this.baseURL + "/category/all";
    return this.http.get<ItemCategory[]>(url);

  }
}
