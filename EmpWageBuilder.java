package com.blz.empwageoops;

import java.util.Random;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		
//Main-Branch
		  System.out.println("Welcome to Employee Wage Computation Program :)");
		  
//UC-1-Check Employee is Present or Absent
		  Random empCheck = new Random();
	      int n = empCheck.nextInt(2);
		  if (n == 1)
				System.out.println("Employee is Present");
			     else
					System.out.println("Employee is Absent");
	}

}