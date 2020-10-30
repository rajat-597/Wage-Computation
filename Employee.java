package practice3;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computatation program");
		Employee e = new Employee();
		e.check();
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

}
