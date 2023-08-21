import java.util.Scanner;
public class TheCalculatorDilemma
{

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter two numbers");
	    int number1 = Scan.nextInt();
	    int number2 = Scan.nextInt();
	    System.out.println("Enter an operator");
		 String operator= Scan.next();
		switch(operator)
		{ 
		    case "-":
		    System.out.println("subtraction of 2 numbers " +(number1-number2));
		    break;
			case "*":
			System.out.println("multiplication of 2 numbers " + (number1*number2));
			break;
			case "+":
			System.out.println("addition of 2 numbers " +(number1+number2));
			break;
			case "/":
			System.out.println("division of 2 numbers " +(number1/number2));
			break;
		}
	}
}

			
		
		
	


