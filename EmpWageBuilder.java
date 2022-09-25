package com.blz.empwageoops;


import java.util.ArrayList;

public class EmpWageBuilder implements ComputeEmpWage {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private ArrayList<CompanyEmpWage> companyWageList;	
	
	public EmpWageBuilder() {
		companyWageList = new ArrayList<>();
	}

	public static void main(String args[]) {
		ComputeEmpWage wageCalculator = new EmpWageBuilder();
		
		wageCalculator.addCompany("Google", 50, 15, 200);
		wageCalculator.addCompany("Amazon", 80, 20, 120);	
		wageCalculator.addCompany("Netflix", 90, 18, 220);
		wageCalculator.computeEmpWage();
	}
	
	public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		CompanyEmpWage companyWage = new CompanyEmpWage(companyName, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
		companyWageList.add(companyWage);
	}
	
	public void computeEmpWage() {
		for (int i = 0; i < companyWageList.size(); i++) {
			CompanyEmpWage companyWage = companyWageList.get(i);
			companyWage.setTotalEmpWage(this.computeEmpWage(companyWage));
			System.out.println(companyWage);
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyWage) {
		int empHrs = 0;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;		
		
		for (totalWorkingDays = 1; totalEmpHrs <= companyWage.maxHoursInMonth && totalWorkingDays < companyWage.numOfWorkingDays; totalWorkingDays++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch (empCheck) {
				case IS_FULL_TIME :
					empHrs = 8;
					System.out.println("Employee is present Full time.");
					break;
					
				case IS_PART_TIME :
					empHrs = 4;
					System.out.println("Employee is present Part time.");
					break;
					
				default :
					empHrs = 0;
					System.out.println("Employee is absent.");	
			}			
			empWage = empHrs * companyWage.empRatePerHour;
			totalEmpHrs += empHrs;
			//totalEmpWage += empWage;
			System.out.println("Day " + totalWorkingDays + "	Employee hours : " + empHrs +"	Wage $" + empWage);
		}		
		return (totalEmpHrs * companyWage.empRatePerHour);
	}	
}