package ProblemStatement;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) 
	{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name ");
    String hemanth=scan.next();
    System.out.println("enter your DOB :");
    int barath=scan.nextInt();
    greet(hemanth);
  int sam= Calculatingage(barath);
    System.out.println("Your age is :"+sam);
     }
	public static void greet(String hemanth) {
		System.out.println("Welcome "+hemanth);
		
	}
	public static int Calculatingage(int barath) {
		int c=2023-barath;
		return c;
	
		
	}
}
