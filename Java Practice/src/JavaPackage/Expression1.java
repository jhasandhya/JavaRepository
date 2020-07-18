package JavaPackage;

//Java program for the expression: ((((10+2)-2)*2)+2)/2)

public class Expression1 {
	
	public int Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Result of Addition is " + c);
		return c;
	}
	public int Sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Result of substraction is " + c);
		return c;
	}
	public int Mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Result of multiplication is " + c);
		return c;
	}
	public void Div(int a, int b)
	{
		int c = a/b;
		System.out.println("Result of expression is " + c);
	}
	
	public static void main(String[] args)
	{
		Expression1 E1 = new Expression1();
		int sum_result=E1.Sum(10, 2);
		int sub_result=E1.Sub(sum_result,2);
		int mul_result=E1.Mul(sub_result, 2);
		int sum_result2=E1.Sum(mul_result, 2);
		E1.Div(sum_result2,2);
    }
}
