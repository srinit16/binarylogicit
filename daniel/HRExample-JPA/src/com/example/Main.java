package com.example;


import java.util.Scanner;

import com.example.dao.ConnectionFactory;
import com.example.dao.EmployeeDao;
import com.example.dao.HRException;
import com.example.pojos.Employee;
public class Main {
	//tab space /t
	// new line  /n
	
			public static void menu() { 
					System.out.println("*****Human Resource App**********");
					System.out.println("Option\t\t\t\tChoice");
					System.out.println("Find All\t\t\tA");
					System.out.println("Find By ID \t\t\tB");
					System.out.println("Exit \t\t\t X");
					System.out.print("Enter Your Choice:");
				
			}
			public static void main(String[] args) {
				//singleton design pattern for ConnectionFactory
			//	ConnectionFactory cf=ConnectionFactory.get();
//				ConnectionFactory cf2=ConnectionFactory.get();
//				System.out.println(cf.hashCode());
//				System.out.println(cf2.hashCode());
//				System.out.println(cf==cf2);
				
				
//				Scanner sc=new Scanner(System.in);
//				String ch="";
//				EmployeeDao dao=cf.getConnection();
//				do {
//					menu();
//					ch=sc.nextLine();
//					switch(ch) {
//						case "A":
//							try {
//								dao.findAll().forEach(Employee::print);
//							}catch(HRException se) {
//								System.out.println(se);
//							}
//							//dao.findAll().forEach(e->e.print());
//							//for(Employee e: dao.findAll()){
//									//e.print();
//							//}
//							break;	
//						case "B":
//							try {
//							 dao.findById("1").print();
//							}catch(HRException se) {
//								System.out.println(se);
//							}
//							break;
//						case "X":
//						
//							break;
//						default:
//								System.out.println("Invalid Choice");
//					}
//				}while(!ch.equals("X"));
//					
//				
		
			
		}
}
