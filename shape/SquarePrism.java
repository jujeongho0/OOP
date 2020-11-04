package lab11;

import java.util.Scanner;

class nh_exception extends Exception{}

public class SquarePrism extends Square {
	
	double nh;
	
	public void setter()
	{
		super.setter();
		
		Scanner sc = new Scanner(System.in);		
				
		System.out.printf("Please input Normal Height:");
		nh = sc.nextDouble();
				
		if(nh < 0)
		{
			int correct = 0;
			while(correct == 0)
			{
				try 
				{
					correct = 1;
					System.out.printf("\nError : normal height should be positive\n");
					System.out.printf("Please input positive value for height:");
					nh = sc.nextDouble();
					if(nh < 0)
					{
						throw new nh_exception();
					}
				}
				catch(nh_exception e)
				{
					correct = 0;					
				}
			}
		}		
		
		this.nh = nh;
	}
	
	public void getter()
	{
		System.out.printf("\n\nType of shape : Square Prism\n");
		System.out.printf("\t¡ÜCoordinates of upper left vertex : %.1f, %.1f\n",this.UL.x,this.UL.y);
		System.out.printf("\t¡ÜCoordinates of lower right vertex : %.1f, %.1f\n",this.LR.x,this.LR.y);			
		System.out.printf("\t¡ÜSide of a square : %.1f\n",getDistance(this.UL, this.LR)/Math.sqrt(2));
		System.out.printf("\t¡ÜNormal Height : %.1f\n",this.nh);
		System.out.printf("\t¡ÜLateral Surface Area : %.2f\n",4*this.nh*getDistance(this.UL, this.LR)/Math.sqrt(2));
		System.out.printf("\t¡ÜSurface Area : %.2f\n",2*getArea(this.UL, this.LR)+4*this.nh*getDistance(this.UL, this.LR)/Math.sqrt(2));
		System.out.printf("\t¡ÜVolume : %.2f\n",getArea(this.UL, this.LR)*this.nh);
	}
}
