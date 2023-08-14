package ProblemStatement;
import java.util.Scanner;

public class Assignment1 {
	
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name");
			String sudha=scan. nextLine();
			
			greet(sudha);
			scan.close();
		}
		public static void greet(String sudha) {
			System.out.println("hello " +sudha);
			
		}

	}

