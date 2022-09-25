package com.blz.empwageoops;

public interface ComputeEmpWage {
	
	public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
		public void computeEmpWage();
		public int getTotalEmpWage(String company);
	}
