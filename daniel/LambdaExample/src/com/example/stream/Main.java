package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
		public static void main(String[] args) {
			Employee[] emps= {
							new Employee(1,"Nitin",2300.01),
							new Employee(2,"Alex",2345.11),
							new Employee(3,"Daniel",4310.41),
							new Employee(14,"Henry",4330.0),
							new Employee(15,"Ivin",5600.00),
							new Employee(16,"Kevin",3249.11),
			};
			
			List<Employee> empList=new ArrayList<>(Arrays.asList(emps));
			
			Consumer<Employee> action= e-> System.out.println(e.toString());
			empList.stream()
					.filter(e->e.getSalary()>4000)
					.filter(e-> e.getName().contains("e"))
					.forEach(action);
			
		}
}
