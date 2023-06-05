import { Component } from '@angular/core';
import { Item } from 'src/app/_model/item';
import { ProductService } from 'src/app/_service/product.service';
import {  OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
        product:Item[];

      constructor(private ps:ProductService, private route:ActivatedRoute){

      }
      ngOnInit(): void {
        this.route.paramMap.subscribe(()=>{
          let cid:number=+this.route.snapshot.paramMap.get("id");
          this.fetchAllProducts(cid);
        });
        
      }

      public fetchAllProducts(cid:number){
        this.ps.getProduct(cid).subscribe(data=>{
                   
          this.product=data;
        //  console.log(this.products);
      });
      }

}
