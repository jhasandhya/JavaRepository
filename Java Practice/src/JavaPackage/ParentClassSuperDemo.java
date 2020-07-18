package JavaPackage;

public class ParentClassSuperDemo {
	
	public ParentClassSuperDemo()
	{
		this(1,2,3,4);
		System.out.println("This is default constructor");
	}
	public ParentClassSuperDemo(int a)
	{
		this();
		System.out.println("This is one parametrised constructor");
	}
	public ParentClassSuperDemo(int a, int b)
	{
		System.out.println("This is two parametrised constructor");
	}
	public ParentClassSuperDemo(int a, int b, int c)
	{
		this(1);
		System.out.println("This is three parametrised constructor");
	}
	public ParentClassSuperDemo(int a, int b, int c, int d)
	{
		
		System.out.println("This is four parametrised constructor");
	}
	
	public static void main(String[] args) {
		
	}
	
}
