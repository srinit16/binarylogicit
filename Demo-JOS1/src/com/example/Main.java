package com.example;



public class Main {
	
	public static int sum(int[] num, Calculate c) {
			int total=0;
			for(int n:num) {
				if(c.test(n)) {
					total+=n;
				}
			}
			return total;
	}
	
	public static void main(String[] args) {
			int[] number= {1,2,3,4,5,6,7,8,9,10};
			int r=0;
		
			// write a code to sum total of array's elements that are odd
//			Calculate c=(int n)->{
//									
//					return n % 2 != 0 ; 
//				};
//			
			r=sum(number, n-> n%2!=0 );
			System.out.println(r);
			
			// write a code to sum total of array's elements that are even
			r=sum(number,n->n % 2 == 0);
			
			System.out.println(r);
			
			// write a code to sum total of array's elements
			r=sum(number, n->true);
					
				
			System.out.println(r);
			
			
			// write a code to sum total of array's elements that are greater than 5
			
			//write a code to sum total of elements that are prime number
	}

}
