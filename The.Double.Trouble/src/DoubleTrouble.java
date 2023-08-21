import java.util.Scanner;
public class DoubleTrouble 
{

	public static void main(String[] args)
	{
		Scanner Scan =  new Scanner(System.in);
		System.out.println("enter a number");
		int num = Scan.nextInt();
		int res = doubleTheNumber(num);
		System.out.println( "result is " + res);
		
	}
	public static int doubleTheNumber(int num)
	{
		return num *2;
	}
}
