import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/_model/product';
import { ProductService } from 'src/app/_service/product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
    products:Product[];
    
    constructor(private ps:ProductService){

    }
  
  ngOnInit(): void {
            this.ps.getProduct(3).subscribe(data=>{
               
                this.products=data;
              //  console.log(this.products);
            });
           
  }

}
