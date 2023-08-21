import java.util.Scanner;
public class GalacticArithematic 
{

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("enter two numbers");
		long num1= Scan.nextLong();
		long num2 = Scan. nextLong();
		System.out.println(galacticAddition(num1,num2));
		
	}
	public static long galacticAddition(long num1, long num2)

	{
		return num1+num2;
	}
	
	
	
}
