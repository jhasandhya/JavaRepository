package JavaPackage;

public class Constructor1 {
	
	int a, b, c, d;
	
	public Constructor1()
	{
		this(1,2,3,4);
		System.out.println("This is default Constructor");
	}
	public Constructor1(int x)
	{
		this();
		a=x;
		System.out.println("This is 1 parametrized constructor with value "+ a);
	}
	public Constructor1(int x, int y)
	{
		this(1,2,3);
		a=x;
		b=y;
		System.out.println("This is 2 parametrized constructor with value "+ a +","+ b);
	}
	public Constructor1(int x, int y, int z)
	{
		this(1);
		a=x;
		b=y;
		c=z;
		System.out.println("This is 3 parametrized constructor with value "+ a + ","+ b +","+ c);
	}
	public Constructor1(int x, int y, int z, int w)
	{
		a=x;
		b=y;
		c=z;
		d=w;
		System.out.println("This is 4 parametrized constructor with value "+ a +","+ b +","+ c +","+ w);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Constructor1 C1 = new Constructor1(2,3);
	}
	
}
