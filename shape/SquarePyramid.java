package lab11;

import java.util.Scanner;

class sh_exception extends Exception{}

public class SquarePyramid extends SquarePrism {
	
	double sh;
	
	public void setter()
	{
		super.setter();
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.printf("Please input Slant Height:");
		sh = sc.nextDouble();
				
		if(sh <= this.nh)
		{
			int correct = 0;
			while(correct == 0)
			{
				try 
				{
					correct = 1;
					System.out.printf("\nError : Slant Height should be larger than normal Height.\n");
					System.out.printf("Please input correct Slant Height:");
					sh = sc.nextDouble();
					if(sh <= this.nh)
					{
						throw new sh_exception();
					}
				}
				catch(sh_exception e)
				{
					correct = 0;					
				}
			}
		}		
		this.sh = sh;	
	}
	
	public void getter()
	{
		System.out.printf("\n\nType of shape : Square Pyramid\n");
		System.out.printf("\t¡ÜCoordinates of upper left vertex : %.1f, %.1f\n",this.UL.x,this.UL.y);
		System.out.printf("\t¡ÜCoordinates of lower right vertex : %.1f, %.1f\n",this.LR.x,this.LR.y);			
		System.out.printf("\t¡ÜSide of a square : %.2f\n",getDistance(this.UL, this.LR)/Math.sqrt(2));
		System.out.printf("\t¡ÜNormal Height : %.1f\n",this.nh);
		System.out.printf("\t¡ÜSlant Height : %.1f\n",this.sh);
		System.out.printf("\t¡ÜSurface Area : %.2f\n",getArea(this.UL, this.LR)+2*this.sh*getDistance(this.UL, this.LR)/Math.sqrt(2));
		System.out.printf("\t¡ÜVolume : %.2f\n",getArea(this.UL, this.LR)*this.nh/3);
	}
}
