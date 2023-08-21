import java.util.Scanner;
public class ArithematicOperations 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		
		System.out.println("enter 2 numbers");
		int num3 = Scan.nextInt();
		int num4 = Scan.nextInt();
		System.out.println(multiplyNumbers(num3,num4));
		
		System.out.println("enter 2 numbers");
		int num5 = Scan.nextInt();
		int num6 = Scan.nextInt();
		System.out.println(divideNumbers(num5,num6));
		

		System.out.println("enter 2 numbers");
		int num7 = Scan.nextInt();
		int num8 = Scan.nextInt();
		System.out.println(findRemainder(num7,num8));
		
		
	}
	public static int subtractNumbers(int num1, int num2)

	{
		return num1 - num2; 
	}
	public static int multiplyNumbers(int num3, int num4)
	{
		return num3 * num4;
	}
	public static double divideNumbers(int num5, int num6)
	{
		return num5 / num6;
	}
	public static int findRemainder(int num7, int num8)
	{
		return num7 % num8;
	}
	
	
	
	
	
}
