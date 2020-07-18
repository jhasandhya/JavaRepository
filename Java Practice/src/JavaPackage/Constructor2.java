package JavaPackage;

public class Constructor2 {
int a, b, c, d;
	
	public Constructor2()
	{
		this(1,2,3);
		System.out.println("This is default Constructor");
	}
	public Constructor2(int x)
	{
		this(1,2);
		a=x;
		System.out.println("This is 1 parametrized constructor with value "+ a);
	}
	public Constructor2(int x, int y)
	{
		this(1,2,3,4);
		a=x;
		b=y;
		System.out.println("This is 2 parametrized constructor with value "+ a +","+ b);
	}
	public Constructor2(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println("This is 3 parametrized constructor with value "+ a + ","+ b +","+ c);
	}
	public Constructor2(int x, int y, int z, int w)
	{
		this();
		a=x;
		b=y;
		c=z;
		d=w;
		System.out.println("This is 4 parametrized constructor with value "+ a +","+ b +","+ c +","+ w);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Constructor2 C2 = new Constructor2(1);
	}
}
