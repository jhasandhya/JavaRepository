package JavaPackage;
//(((((10/2)+2-2)-2)*2)
public class Expression {
	
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Result of division is "+c);
		return c;
	}
	public int sum(int a,int b)
	{
		int z;
		z=a+b;
		System.out.println("The result of addition is"+ " " + z);
		return z;
	}
	public int sub(int a,int b)
	{
		int x;
		x=a-b;
		System.out.println("The result of substraction is "+x);
		return x;
	}
	public void mul(int a,int b)
	{
		int y;
		y=a*b;
		System.out.println("The result of expression is "+y);
	}
	public static void main(String[] args)
	{
		Expression Result=new Expression();
		int divResult = Result.div(10,2);
		int sumResult = Result.sum(divResult, 2);
		int subResult1 = Result.sub(sumResult, 2);
		int subResult2 = Result.sub(subResult1, 2);
		Result.mul(subResult2, 2);
		
	}
}
