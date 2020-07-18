package JavaPackage;

//Java program for the expression: ((((10-2)+2)+2)*2)/2)

public class Expression2 {

	public int Sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Result of subsraction is " + c);
		return c;
	}
	public int Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Result of addition is " + c);
		return c;
	}
	public int Mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Result of Multiplication is " + c);
		return c;
	}
	public void Div(int a, int b)
	{
		int c = a/b;
		System.out.println("Result of expression is " + c);
	}
	
	public static void main(String[] args) {
		Expression2 E2=new Expression2();
		int sub_result=E2.Sub(10,2);
		int sum_result1=E2.Sum(sub_result, 2);
		int sum_result2=E2.Sum(sum_result1, 2);
		int mul_result=E2.Mul(sum_result2, 2);
		E2.Div(mul_result, 2);
	}	
	
	
}
