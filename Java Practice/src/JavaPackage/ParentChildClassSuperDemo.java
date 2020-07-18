package JavaPackage;


public class ParentChildClassSuperDemo extends ParentClassSuperDemo{
	
	public ParentChildClassSuperDemo()
	{
		this(1);
		System.out.println("This is Child's default constructor");
	}
	public ParentChildClassSuperDemo(int a)
	{
		this(3,2,4);
		System.out.println("This is child's one parametrised constructor");
	}
	public ParentChildClassSuperDemo(int a, int b)
	{
		System.out.println("This is two Child's parametrised constructor");
	}
	public ParentChildClassSuperDemo(int a, int b, int c)
	{
		super(4,5,6);
		System.out.println("This is Child's three parametrised constructor");
	}
	public ParentChildClassSuperDemo(int a, int b, int c, int d)
	{
		this();
		System.out.println("This is Child's four parametrised constructor");
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ParentChildClassSuperDemo Obj_Child1= new ParentChildClassSuperDemo(1,2,3,4);
	}

}