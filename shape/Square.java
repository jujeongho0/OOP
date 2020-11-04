package lab11;

import java.util.Scanner;

class x_exception extends Exception{}
class y_exception extends Exception{}

public class Square implements Shapes {

		point2D UL = new point2D();
		point2D LR = new point2D();		
		
		public double getDistance(point2D point1, point2D point2)
		{
			return Math.sqrt(Math.pow((point1.x-point2.x),2)+Math.pow((point1.y-point2.y),2));
		}
		
		public double getArea(point2D point1,point2D point2, point2D point3)
		{
			double p = ((getDistance(point1,point2)+getDistance(point1,point3)+getDistance(point2,point3))/2);
			
			return Math.sqrt(p*(p-getDistance(point1,point2))*(p-getDistance(point1,point3))*(p-getDistance(point2,point3)));
			
		}
		
		public double getArea(point2D point1,point2D point2)
		{	
			double sideofSquare = getDistance(point1,point2)/Math.sqrt(2);
			
			return Math.pow(sideofSquare, 2);
		}
		
		public void setter()
		{
			int correct=0;
			Scanner sc = new Scanner(System.in);
			
			
			while(correct == 0)
			{
				try
				{			
					correct = 1;
					System.out.printf("Please input x-coordinate of the Upper Left of the Square:");
					UL.x = sc.nextDouble();
					System.out.printf("Please input y-coordinate of the Upper Left of the Square:");
					UL.y = sc.nextDouble();
					System.out.printf("Please input x-coordinate of the Lower Right of the Square:");
					LR.x= sc.nextDouble();
					System.out.printf("Please input y-coordinate of the Lower Right of the Square:");
					LR.y = sc.nextDouble();	
	
					if(UL.x >= LR.x)
					{
						throw new x_exception();				
					}
					if(UL.y <= LR.y)
					{
						throw new y_exception();	
					}				
				}
				catch(x_exception e)
				{	
					correct = 0;
					System.out.printf("\nError : x_coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\n"
							+ "Please enter valid coordinates\n");
				}
				catch(y_exception e)
				{
					correct = 0;
					System.out.printf("\nError : y_coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n"  
							+ "Please enter valid coordinates\n");
				}
			}
			
			this.UL = UL;
			this.LR = LR;
			
		}
		
		public void getter()
		{
			System.out.printf("\n\nType of shape : Square\n");
			System.out.printf("\t¡ÜCoordinates of upper left vertex : %.1f, %.1f\n",this.UL.x,this.UL.y);
			System.out.printf("\t¡ÜCoordinates of lower right vertex : %.1f, %.1f\n",this.LR.x,this.LR.y);			
			System.out.printf("\t¡ÜSide of a square : %.2f\n",getDistance(this.UL, this.LR)/Math.sqrt(2));
			System.out.printf("\t¡ÜSurface Area : %.2f\n",getArea(this.UL, this.LR));	
		}		
}