package JavaPackage;

public class ParentMethodSuperDemo {
	
	public void M1()
	{
		this.M4(1, 2, 3, 4);
		System.out.println("zero input method");
	}
	public int M2(int a)
	{
		this.M1();
		int c=a;
		System.out.println("1 input method");
		return c;

	}
	public int M3(int a,int b, int c)
	{
		this.M2(1);
		int d=a+b+c;
		System.out.println("2 input method");
		return d;

	}
	public int M4(int a,int b, int c, int d)
	{
		int e=a+b+c+d;
		System.out.println("4 input method");
		return e;

	}
}
