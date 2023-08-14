package jkuyt765;

import java.util.Scanner;
class methodApp{
	
public static void main(String []args){
    Scanner scan =new Scanner (System.in);
    System.out.println("Enter your mark: ");
    int mark=scan.nextInt();
    scan.close();
    result(mark);
    int r1=res2(mark);
    System.out.println(r1);
}
public static void result(int mark){
	if (mark >= 90) {
	    System.out.println("A+ grade");
	} else if (mark >= 80 || mark>70) {
	    System.out.println("A grade");
	} else if (mark >= 70 || mark>60) {
	    System.out.println("B grade");
	} else if (mark >= 60 || mark>60) {
	    System.out.println("C grade");
	} else if (mark >= 50 && mark>60) {
	    System.out.println("D grade");
	} else {
	    System.out.println("You are Fail ....");
	}
}
}