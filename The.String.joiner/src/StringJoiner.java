import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter a first name");
		String str1= Scan.next();
		System.out.println("enter a second name");
		String str2=Scan.next();
		String res=	 joinString( str1, str2);
		System.out.println("result is  " + res);
	}
	public static String joinString(String str1,String str2) 
	{
		return str1 +" "+str2;
	}

}
