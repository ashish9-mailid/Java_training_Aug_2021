package com.training;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Before(value="execution(* com.training.EmployeeService.*(..))")
	public void before()
	{
		System.out.println("Before");
	}
	
	@After(value="execution(* com.training.EmployeeService.*(..))")
	public void after()
	{
		System.out.println("after");
	}
	
	//AfterThrowing("execution(* *.*.test*(..)
	@AfterThrowing("execution(* com.training.EmployeeService.test())")
	public void test()
	{
		System.out.println("Exception thrown");
	}
	
	
	@Around("execution(* com.training.EmployeeService.test*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint)
	{
		System.out.println("Entering around advice..");
		Object value =null;
		try {
		value = joinPoint.proceed(); // calls testEmp()
				
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value ="+value);
		return value;
	}
	
	
	
	
	
}
