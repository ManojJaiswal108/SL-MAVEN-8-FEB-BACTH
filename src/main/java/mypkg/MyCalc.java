package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public void show()
	{
		System.out.println("Hello Jenkins from SL 1 MJ NOV BATCH! Thanks GitHub Action Thanks Subghsish");
	}
	public void greeting()
	{
		System.out.println("Hello SL Thanks Manoj");
	}

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		System.out.println("Sum is: "+calc.sum(20, 10));
		System.out.println("Diff is: "+calc.diff(20, 10));
		System.out.println("Multiply is: "+calc.mul(20, 10));
		System.out.println("Div is: "+calc.div(20, 10));
		calc.show();
		calc.greeting();

	}

}
