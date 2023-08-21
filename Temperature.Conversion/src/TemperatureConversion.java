import java.util.Scanner;
public class TemperatureConversion 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("welcome to temperature conversion tool!");
		System.out.println("enter an choice");
		int choice = Scan.nextInt();
		if (choice==1)
		{
			System.out.println("enter the temperature in celsius");
			double celsius = Scan.nextDouble();
			double F =	celsiusToFahrenheit(celsius);
			System.out.println(celsius+" C is equivalent to "+ F);
			
		}
		
		else if  ( choice==2)
		{
			System.out.println("enter the temperature in Fahrenheit");
			double Fahrenheit= Scan.nextDouble();
			double c = fahrenheitToCelsius(Fahrenheit);
			System.out.println(Fahrenheit+" C is equivalent to " + c);
			
		}
		else
		{
			System.out.println("invalid option");
		}
	
	
	 }
		
		public static double celsiusToFahrenheit(double celsius)
		{
			
			return(celsius*9/5)+32;
		}
		
		public static double fahrenheitToCelsius(double fahrenheit)
		{
			return(fahrenheit-32)*5/9;
		}
		
	
}
	
	
	
