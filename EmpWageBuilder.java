package com.blz.empwageoops;
	public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public static void main(String[] args) {
	
		computeEmpWage();
	}
	
//UC7- Re-factor the Code to write a Class Method to Compute Employee Wage
	
	public static void computeEmpWage() {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;		
		
		for (totalWorkingDays = 1; totalEmpHrs <= MAX_HRS_IN_MONTH && 
				totalWorkingDays <= NUM_OF_WORKING_DAYS; totalWorkingDays++) {
			int empCheck = (int) ((Math.random() * 10) % 3);
			
			switch(empCheck) {
					
			  case IS_FULL_TIME :
				    empHrs = 8;
					System.out.println("Employee is present : Full Time");
					break;
					
			  case IS_PART_TIME :
					empHrs = 4;
					System.out.println("Employee is present : Part Time");
					break;
					
				default :
					empHrs = 0;
					System.out.println("Employee is absent");	
			}
			
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;
			totalEmpWage += empWage;
			System.out.println("Day " + totalWorkingDays + " Employee hours : " + empHrs +"	Wage $" + empWage);
		}
		
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("\n Employee Monthly Wage : $" + totalEmpWage);
	}
}