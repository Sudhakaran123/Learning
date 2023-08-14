import java.util.Scanner;
public class inputFromkeyboard 
 {
   public static void main(String[] args) 
   {

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Your Name");

	String name=scan.nextLine();

	greet(name);
	scan.close();

	}

	public static void greet(String name)
	{

	System.out.println("Hello "+name+" How Are You...?");

	}

	}


