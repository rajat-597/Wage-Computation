package practice3;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computatation program");
		Employee e = new Employee();
		e.check();
		e.wages();
		
	}
public void check()
{
	double d = Math.random();
	if(d==0)
	{
		System.out.println("Employee is not present");
	}
	else
	{
		System.out.println("Employee is present");
	}
}
public void wages()
{
	int wph = 20;
	int fdw = 8;
	int total;
	total=wph*fdw;
	System.out.println("Daily Employee Wages "+ total);
}

}
