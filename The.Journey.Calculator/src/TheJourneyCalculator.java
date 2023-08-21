import java.util.Scanner;
public class TheJourneyCalculator {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println("enter a speed of vehicle");
		double speed = Scan.nextDouble();
		System.out.println("enter a time of vehicle");
		double time = Scan.nextDouble();
		JourneyCalculator  J1= new JourneyCalculator();
		double distance= J1.calculateDistance( speed,time);
		System.out.println(distance);
		
	}

}
