import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sudha=new Scanner(System.in);
		System.out.println("Enter the purchase amount ");
		double r1=sudha.nextDouble();
		System.out.println("Enter the tax rate (in decimal point)");
		double r2=sudha.nextDouble();
		System.out.println("Total cost including in :");
		
	     double	karan=calculateTotalWithTax(r1,r2);
	     double res=karan+r1;
	     System.out.println(res);
	
		
		

	}
	public static double calculateTotalWithTax( double purchaseamount ,double taxrate) {
		return purchaseamount * taxrate;
		
	}

}
