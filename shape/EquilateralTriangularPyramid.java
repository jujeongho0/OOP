package lab11;

import java.util.Scanner;

class sh_exception extends Exception{}

public class EquilateralTriangularPyramid extends EquilateralTriangularPrism {

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
		System.out.printf("\n\nType of shape : Equilateral Triangular Pyramid\n");
		System.out.printf("\t¡ÜCoordinates of Vertex One : %.1f, %.1f\n",this.point1.x,this.point1.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Two : %.1f, %.1f\n",this.point2.x,this.point2.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Three : %.1f, %.1f\n",this.point3.x,this.point3.y);
		System.out.printf("\t¡ÜLength of side 1 : %.1f\n",getDistance(this.point1,this.point2));
		System.out.printf("\t¡ÜLength of side 2 : %.1f\n",getDistance(this.point1,this.point3));
		System.out.printf("\t¡ÜLength of side 3 : %.1f\n",getDistance(this.point2,this.point3));
		System.out.printf("\t¡ÜNormal Height : %.1f\n",this.nh);
		System.out.printf("\t¡ÜSlant Height : %.1f\n",this.sh);
		System.out.printf("\t¡ÜSurface Area : %.1f\n",(getArea(this.point1,this.point2,this.point3))+((getDistance(this.point1,this.point2)+getDistance(this.point1,this.point3)+getDistance(this.point2,this.point3))*this.sh/2));		
		System.out.printf("\t¡ÜVolume : %.1f\n",getArea(this.point1,this.point2,this.point3)*this.nh/3);
	}
}
