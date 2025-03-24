package MavenProject;

public class Calculator {
	public int sum(int a, int b)
	{
		int c,d;
		c=10+5;
		return (a+b);
	}
	public int diff(int a, int b)
	{
		return (a-b);
	}
	public int mul(int a, int b)
	{
		return (a*b);
	}
	public int div(int a, int b)
	{
		return (a/b);
	}
	public int mod(int a, int b)
	{
		return (a%b);
	}
	public void greet()
	{
		System.out.println("Hello dev branch");
	}
	

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("Mul is :"+calc.mul(20, 10));
		System.out.println("Div is :"+calc.div(20, 10));
		System.out.println("Mod is :"+calc.mod(20, 10));
		calc.greet();
	}
}
