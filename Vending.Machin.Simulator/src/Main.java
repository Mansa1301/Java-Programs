import java.util.Scanner;
public class Main {

	public static void getProduct(String productCode)
	{
		switch (productCode)
		{
		case "po1":
		System.out.println("pepsi");
		break;
		
		case "po2":
		System.out.println("cococola");
		break;
		
		
		case "po3":
		System.out.println("fanta");
		break;
		
		case "po4":
		System.out.println("jaljeera");
		break;
			
		case "po5":
		System.out.println("mountainDew");
		break;
			
		case "po6":
		System.out.println("boatguava");
		break;
		
		default:
		System.out.println("panaka");
		break;
			
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter productCode between po1-po6");
		String productCode = Scan.next();
		getProduct( productCode);
	}
}
