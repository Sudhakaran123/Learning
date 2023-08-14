import java.util.Scanner;

public class TemperatureCunversion 
{

	
	public static void main(String[] args) 
	{
    Scanner scan=new Scanner(System.in);
    System.out.println("Temperature Conversion Tool! "); 
    System.out.println("Enter your choice :");
    int i = scan.nextInt();
    if(i==1)
    {
    	  System.out.println(CelsiustoFahrenheit());
    }
    else if(i==2){
    	System.out.println(fahrenheitToCelsius()); 
    	
    }
    else
    {
    	System.out.println("enter the valid option : ");
    }
  
    
	}
	
	public static double CelsiustoFahrenheit() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius");
	    double c1=scan.nextDouble();
	    return (c1*9/5)+32;	
	}
	public static double fahrenheitToCelsius() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
	    double choice2=scan.nextDouble();
		return (choice2-32)*5/9;
		
		
	}

}
