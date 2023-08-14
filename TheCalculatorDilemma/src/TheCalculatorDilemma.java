import java.util.Scanner;

public class TheCalculatorDilemma
{
	public static void main(String[] args) 
	{
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a first number");
	
	double num1=scan.nextDouble();
	System.out.println("enter a second number");
	double num2=scan.nextDouble();
	System.out.println("enter the operator : ");
	char operator = scan.next().charAt(0);
	performoperation(num1,operator,num2);
   
	}
	public static void performoperation(double num1,char operator,double num2) 
	{
       

        switch (operator)
        {
            case '+':
               double result1= num1 + num2;
               System.out.println("result 1 is"+result1);
               break;
		case '-':
                double result2= num1 - num2;
                System.out.println("result 2is"+result2);
                break;
                
		case '*':
                double result3= num1 * num2;
                System.out.println("result 3 is"+result3);
                break;
                
		case '/':
               double result4= num1 / num2;
               System.out.println("result 4 is"+result4);
               break;
                        	  
               
            default:
                System.out.println("Error: Invalid operator.");
                break;
	    }
          
        
    
    }
}

	


  

