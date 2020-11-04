package pack;

import java.util.Scanner;

public class MaximumFinder {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter three floating-point values separated by spaces: ");
				
				double number1=input.nextDouble();
				double number2=input.nextDouble();
				double number3=input.nextDouble();
				
				double result = maximum(number1,number2,number3);
				double result_average = average(number1,number2,number3);
				System.out.println("Maximum is : " + result);
				System.out.println("Average is : " + result_average);
								
	}
		
		public static double maximum(double x, double y, double z)
		{
			
			double maximumValue = x;
			
			if(y>maximumValue)
			{
				maximumValue=y;
			}
			
			if(z>maximumValue)
			{
				maximumValue = z;
			}
			
			return maximumValue;
				
		}
		public static double average(double a, double b, double c)
		{
			double averageValue = (a+b+c)/3;
			return averageValue;
		
		}
}