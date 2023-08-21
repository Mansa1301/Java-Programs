import java.util.Scanner;
public class Main 
{

	public static void checkDiscount(double purchaseAmount)

	{
		if(purchaseAmount > 100)
		{
			System.out.println("Discount Applicable");
		}

	}

		public static void main(String[] args)

		{

		Scanner Scan = new Scanner (System.in);
		System.out.println("enter purchase amount ");
		double amount = Scan.nextDouble();
		checkDiscount(amount);

		}

}


