package com.blz.empwageoops;
import java.util.Scanner;

public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public static void main(String[] args) {
	
		computeEmpWage("OnePlus", 50, 15, 200);
		computeEmpWage("Amazon", 80, 20, 120);
		computeEmpWage("Meta", 60, 20, 100);
		computeEmpWage("Oracle", 90, 18, 220);
		computeEmpWage("Infosys", 100, 20, 250);
	}
	
	public static void computeEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		
		System.out.println(" 1.OnePlus \n 2.Amazon \n 3.Meta \n 4.Oracle \n 5.Infosys \n Choose a company : ");
		Scanner sc = new Scanner(System.in);
		
		int choose = sc.nextInt();
		
		if(choose <= 5 && choose > 0)
		{
		
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
		else
		{
			System.out.println("Invalid Input ");	
		}
	}
}