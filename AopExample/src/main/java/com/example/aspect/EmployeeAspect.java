package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
		@Before("execution(String getName())")
		public void getNameAdvice() {
			System.out.println("Executing advice on getName");
		}
		
		@Before("execution(* com.example.service.*.get*())")
		public void getAllAdvice() {
			System.out.println("Executing advice on any method");
		}
}
