package pack;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum;
		
		System.out.print("Enter first double number: ");
		number1 = input.nextDouble();
		
		System.out.print("Enter second double number: ");
		number2 = input.nextDouble();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %f%n", sum);
	}
}
