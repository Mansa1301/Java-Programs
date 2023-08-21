import java.util.Scanner;
public class TheTemperatureConverter {

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter Fahrenheit");
		double Fahrenheit = Scan.nextDouble();
		TemperatorCalculator t1 = new TemperatorCalculator();
		double celsius = t1.convertFahrenheitToCelsius(  Fahrenheit);
		System.out.println(celsius);
	}

}
