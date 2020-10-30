package practice3;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Welcome to Employee Wage Computatation program");
		Employee e = new Employee();
		e.check();
		e.wages();
		e.parttimewages(n);
		
	}
public void check()
{
	double d = Math.floor(Math.random()*2);
	if(d==0){
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
public int parttimewages(int x) {
	int pth = 8;
	System.out.println("part time employee is "+x);
	int tw=pth*x;
	return tw;	
}

}
