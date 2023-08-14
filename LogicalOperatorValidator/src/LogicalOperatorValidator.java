import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter (true or false)if the conditiin is statisfied");
		boolean inputisvalid=scan.nextBoolean();
		System.out.println("Enter (true or false)if the conditiin is statisfied");
		boolean inputmeetsacertaincondition=scan.nextBoolean();
		boolean res=ValidInput(inputisvalid,inputmeetsacertaincondition);
		scan.close();
		if (res==true) {
			System.out.println("Input is valid");
		}
		else {
			System.out.println("Input is invalid");
			
		}
		
	}
	public static boolean ValidInput(boolean inputisvalid,boolean inputmeetsacertaincondition) {
		return inputisvalid & inputmeetsacertaincondition;
		
		
		
	}

}
