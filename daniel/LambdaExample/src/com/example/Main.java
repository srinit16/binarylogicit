package com.example;

public class Main {
	
		public static int sum(int[]num, Calculate c) { // c=new OddImpl()
			int total=0;
			for(int n:num) {
				if(c.test(n)) {
					total+=n;
				}
			}
			return total;
		}
	
		public static void main(String[] args) {
			int[]number= {1,2,3,4,5,6,7,8,9,10};
			//sum all the even number
			
			int r=0;
		//	r=sum(number,new EvenImpl());
//			r=sum(number, new Calculate() {
//				@Override
//				public boolean test(int n) {
//			
//					return n%2==0;
//				}
//				
//			});
			
			Calculate c= n->n%2==0;
			r=sum(number,c);
			System.out.println(r);
			
			// sum all the odd number
			
		//	r=sum(number,new OddImpl());
//			r=sum(number,new Calculate() {
//				@Override
//				public boolean test(int n) {
//			
//					return n%2!=0;
//				}
//			});
			r=sum(number,(int n)->{return n%2!=0;});
			System.out.println(r);
			
			// sum all the numbers
						
			//sum all number greater than 3
			
		}

}
