package lab11;

import java.util.Scanner;

class nh_exception extends Exception{}

public class EquilateralTriangularPrism extends EquilateralTriangle {

	double nh;
	
	public void setter()
	{
		super.setter();
				
		Scanner sc = new Scanner(System.in);		
				
		System.out.printf("Please enter normal height:");
		nh = sc.nextDouble();
				
		if(nh < 0)
		{
			int correct = 0;
			while(correct == 0)
			{
				try 
				{
					correct = 1;
					System.out.printf("\nError : Normal height should be positive\n");
					System.out.printf("Please enter positive value for normal height:");
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
		System.out.printf("\n\nType of shape : Equilateral Triangular Prism\n");
		System.out.printf("\t¡ÜCoordinates of Vertex One : %.1f, %.1f\n",this.point1.x,this.point1.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Two : %.1f, %.1f\n",this.point2.x,this.point2.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Three : %.1f, %.1f\n",this.point3.x,this.point3.y);
		System.out.printf("\t¡ÜLength of side 1 : %.1f\n",getDistance(this.point1,this.point2));
		System.out.printf("\t¡ÜLength of side 2 : %.1f\n",getDistance(this.point1,this.point3));
		System.out.printf("\t¡ÜLength of side 3 : %.1f\n",getDistance(this.point2,this.point3));
		System.out.printf("\t¡ÜNormal Height : %.1f\n",this.nh);
		System.out.printf("\t¡ÜSurface Area : %.1f\n",(2*getArea(this.point1,this.point2,this.point3))+((getDistance(this.point1,this.point2)+getDistance(this.point1,this.point3)+getDistance(this.point2,this.point3))*this.nh));		
		System.out.printf("\t¡ÜVolume : %.1f\n",getArea(this.point1,this.point2,this.point3)*this.nh);
	}
}
