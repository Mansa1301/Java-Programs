import java.util.Scanner;
public class MultipleTenChecker  
{

	public static void  checkMultipleOfTen(int n)
	{
	if (n%10 == 0)
	{
		System.out.println("The number is a multiple of " + 10);
	}
	}

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("enter a number");
		int n = Scan.nextInt();
		
		checkMultipleOfTen( n);
	}
	
	
	
	
	
	
}
