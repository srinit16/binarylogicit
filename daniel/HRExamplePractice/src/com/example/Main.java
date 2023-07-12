package com.example;


import java.sql.SQLException;
import java.util.Scanner;

import com.example.dao.EmployeeBL;
import com.example.dao.EmployeeDao;
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
				
				
				Scanner sc=new Scanner(System.in);
				String ch="";
				EmployeeDao dao=new EmployeeBL();
				do {
					menu();
					ch=sc.nextLine();
					switch(ch) {
						case "A":
							try {
								dao.findAll().forEach(Employee::print);
							}catch(SQLException se) {
								System.out.println(se);
							}
							//dao.findAll().forEach(e->e.print());
							//for(Employee e: dao.findAll()){
									//e.print();
							//}
							break;	
						case "B":
							try {
							 dao.findById("1").print();
							}catch(SQLException se) {
								System.out.println(se);
							}
							break;
						case "X":
						
							break;
						default:
								System.out.println("Invalid Choice");
					}
				}while(!ch.equals("X"));
					
				
		}
}
