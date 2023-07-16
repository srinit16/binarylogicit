package com.example;


public class Main {
		public static void main(String[] args) {
				Factory f=new Factory();
				EmployeeDao dao=f.get();
				dao.findAll().forEach(e->System.out.println(e.toString()));
				
				
		}

}
