import java.util.Scanner;
public class ArithmeticOperations 
{
		public static void main(String[] args) 
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("The subtraction result is :"+subtractNumbers(num1, num2));
		System.out.println("The multiply result is :"+multiplyNumbers(num1, num2));
		System.out.println("The division result is :"+divideNumbers(num1, num2));
		System.out.println("The remainder result is :"+findRemainder(num1, num2));

		}

		public static int subtractNumbers(int num1, int num2)
	{
		return num2-num1;
		}
		public static int multiplyNumbers(int num1, int num2)
		{
		return num1*num2;
		}
		public static double divideNumbers(int num1, int num2)
		{
		return num1/num2;
		}
		public static int findRemainder(int num1, int num2)
		{
		return num1%num2;
		}

	}


