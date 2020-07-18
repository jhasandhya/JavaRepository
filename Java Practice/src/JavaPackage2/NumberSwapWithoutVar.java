package JavaPackage2;

public class NumberSwapWithoutVar {
	
	static int a=1;
	static int b=2;
	
	public static void main(String[] args) {
		
	System.out.println("Numbers before swapping  "+ a +"   " + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers after swapping  "+ a +"   " + b);
	}
	
	

}
