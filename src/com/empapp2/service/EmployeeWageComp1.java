package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp1 implements EmpWageComp
{
	private static final int WAGEPERHOUR = 20;
	private static final int FULLTIMEHOURS = 8;
	private static final int PARTTIMEHOURS = 4;
	int monthlyWage = 0;
	int temp = 0;

	@Override
	public int dailyFullWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}

	@Override
	public int dailyPartWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(PARTTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	Employee emp1 = new Employee();
	@Override
	public void empCheck()
	{
		for(int i=0;i<20;i++)
		{
			switch(emp1.isPresent())
			{
				case 1:
					System.out.println("Employee for Company1 is Present and Full Time");
					System.out.println("Daily Employee Wage is :" + dailyFullWage());
					temp = dailyFullWage();
					break;
				case 2:
					System.out.println("Employee for Company1 is Present and Part Time");
					System.out.println("Daily Employee Wage for Company1 is :" + dailyPartWage());
					temp = dailyPartWage();
					break;
				case 0:
					System.out.println("Employee for Company1 is Absent");
					temp = 0;
					break;
			}
			monthlyWage+=temp;
			System.out.println("Monthly Wage for Employee of Company1 is :" + monthlyWage);
		}
	}	
}
