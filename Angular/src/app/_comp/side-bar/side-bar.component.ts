import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ItemCategory } from 'src/app/_model/item-category';
import { ProductService } from 'src/app/_service/product.service';

@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.css']
})
export class SideBarComponent implements OnInit {
  pcat:ItemCategory[];

  constructor(private ps:ProductService, private route:ActivatedRoute){

  }

  ngOnInit(): void {
        
      this.fetchAllProductCategory();
    
  }

  public fetchAllProductCategory(){
    this.ps.getProductCategory().subscribe(data=>{
               
      this.pcat=data;
    //  console.log(this.products);
  });
  }

}
