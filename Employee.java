package practice3;

public class Employee {
	
  static  Employee emp = new Employee();


	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computatation program");
		emp.check();
	    int fulldaywages= emp.wages();
		System.out.println("wages for full day is " + fulldaywages);
	    int parttimewages = emp.halfwages();
		System.out.println("wages for part time employee is " + parttimewages );
		emp.monthlywages();
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

public void monthlywages()
{
	int count=0;
	int Monthly_Wage;
	for(int i=0;i<20;i++)
	{
		double d = Math.floor(Math.random()*5);
		if(d==1)
			count++;
		else if(d==0)
			count--;
	}
	if(count>0) {
	System.out.println("Number of working days in a month is " + count);
	Monthly_Wage = count * emp.wages();
	System.out.println("monthly Wages pf the Employee is "+ Monthly_Wage);
	}
	else
		System.out.println("Employee was absent for whole month");
}

}