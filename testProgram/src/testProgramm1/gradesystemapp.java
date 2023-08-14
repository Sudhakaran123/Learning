package testProgramm1;

import java.util.Scanner;

public class gradesystemapp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your mark ");
		int mark=scan.nextInt();
		scan.close();
		
		gradesystem g1=new gradesystem();
		g1.result(mark);
		
		
		
		
		
		
		
	}
}	
	