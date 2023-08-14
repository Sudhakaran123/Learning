import java.util.Scanner;

public class nameinput 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String sudha=scan.next();
		
		greet(sudha);
	}
	public static void greet(String sudha) {
		System.out.println("hello " +sudha);
		
	}

}
