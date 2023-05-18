import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../_model/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   constructor(private http:HttpClient) {

    }

  public getProduct(cid:number): Observable<Product[]>{
          const url="http://localhost:8080/api/products/findByCategory?id="+cid;
          
          return this.http.get<Product[]>(url);
    }
          
  }
