package HW4_2;

import java.util.Scanner;

public class MaximumFinder {


	public static double maximum(double x,double y, double z)
	{
		double maximumValue = x;

		if(y>maximumValue)
			maximumValue = y;
	
		if(z>maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}	
	public static double average(double x, double y, double z)
	{
		return (x+y+z)/3;
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three floating-point values separated by spaces: ");

		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = Math.max(number1,number2);
		result = Math.max(result, number3);
		double avg = average(number1,number2,number3);
		
		System.out.println("Maximum is :" + result);
		System.out.println("Average is :" + avg);
	}
}
