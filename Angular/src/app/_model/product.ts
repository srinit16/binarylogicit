export class Product {
     id:number;
     category: {
            id: number;
            name: string;
        };
       sku: string;
       name: string;
       description: string;
       unitPrice: number;
       imageUrl: string;
       active: boolean;
       unitsInStock: number;
}
