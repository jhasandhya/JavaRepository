package JavaPackage;

public class Student {
	
	// Variable creation
	int age;
	int roll_no;
	
	//Class method creation
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	
	public static void main(String[] args)
	{
		Student reference=new Student();
		int a = reference.age=25;
		int b = reference.roll_no=1249;
		System.out.println("Value of age is "+ a);
		System.out.println("value of roll_no is " + b);
		reference.display1();
		reference.display2();
	}
}
