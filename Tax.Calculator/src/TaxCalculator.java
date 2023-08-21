import java.util.Scanner;
public abstract class TaxCalculator 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("enter a purchase amount");
		double purchaseamount = Scan.nextDouble();
		System.out.println("enter a tax rate");
		double taxrate = Scan.nextDouble();
		
		double totalamount = calculateTotalWithTax( purchaseamount,taxrate);
		System.out.println("total cost including tax " + totalamount);
		
	}

	public static double calculateTotalWithTax(double purchaseamount, double taxrate)
	{
		double totalamount =(purchaseamount*taxrate)+(purchaseamount);
		return totalamount;
	}
	
	
	
}
