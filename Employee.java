package practice3;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computatation program");
		Employee emp = new Employee();
		emp.check();
	    int fulldaywages= emp.wages();
		System.out.println("wages for full day is " + fulldaywages);
	    int halfdaywages = emp.halfwages();
		System.out.println("wages for part time employee is " + halfdaywages );

	}
public void check()
{
	double d = Math.floor(Math.random()*2);
	if(d==1)
	{
		System.out.println("Employee is present");
		double d1 = Math.floor(Math.random()*2);
		if(d1==1)
		{
			System.out.println("Employee is working for full day");
		}
		else
		{
			System.out.println("Employee is working for part time");
		}

	}
	else
	{
		
		System.out.println("Employee is not present");
	}
}
public int wages()
{
	int wage_per_hour = 20;
	int full_day_work = 8;
	int Daily_Wages = wage_per_hour * full_day_work ; 
	return Daily_Wages;
}
public int halfwages()
{
	int wage_per_hour = 20;
	int part_time_hour=4;
	int halfday_wages = part_time_hour * wage_per_hour;
	return halfday_wages;
}
}