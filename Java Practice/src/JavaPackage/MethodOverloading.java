package JavaPackage;

public class MethodOverloading {
	
	public void M1()
	{
		System.out.println("Parent First Method");
	}
	public void M1(int a)
	{
		System.out.println("Parent second method");
	}
	public void M1(int a, int b)
	{
		System.out.println("Parent third method");
	}

public static void main(String[] args) {
	MethodOverloading O1=new MethodOverloading();
	O1.M1(1);
}
}
