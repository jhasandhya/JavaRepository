package JavaPackage;

public class ParentMethodChildDemo extends ParentMethodSuperDemo {
	
	public void C1()
	{
		this.C4(1, 2, 3, 4);
		System.out.println("zero input method");
	}
	public int C2(int a)
	{
		this.C1();
		int c=a;
		System.out.println("1 input method");
		return c;

	}
	public int C3(int a,int b, int c)
	{
		this.C2(1);
		int d=a+b+c;
		System.out.println("3 input method");
		return d;

	}
	public int C4(int a,int b, int c, int d)
	{
		super.M3(1,2,3);
		int e=a+b+c+d;
		System.out.println("4 input method");
		return e;

	}
	
	public static void main(String[] args) 
	{
		ParentMethodChildDemo obj_child=new ParentMethodChildDemo();
		obj_child.C3(1,2,3);
				
	}

}
