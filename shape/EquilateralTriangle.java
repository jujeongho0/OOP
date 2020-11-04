package lab11;

import java.util.Scanner;

class collinear extends Exception{}
class notEqual extends Exception{}

public class EquilateralTriangle implements Shapes {
	
	point2D point1 = new point2D();
	point2D point2 = new point2D();
	point2D point3 = new point2D();	

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
				System.out.printf("Please input x-coordinate of the Vertex 1 of the triangle:");
				point1.x = sc.nextDouble();
				System.out.printf("Please input y-coordinate of the Vertex 1 of the triangle:");
				point1.y = sc.nextDouble();
				System.out.printf("Please input x-coordinate of the Vertex 2 of the triangle:");
				point2.x = sc.nextDouble();
				System.out.printf("Please input y-coordinate of the Vertex 2 of the triangle:");
				point2.y = sc.nextDouble();	
				System.out.printf("Please input x-coordinate of the Vertex 3 of the triangle:");
				point3.x = sc.nextDouble();
				System.out.printf("Please input y-coordinate of the Vertex 3 of the triangle:");
				point3.y = sc.nextDouble();
					
				if(point1.x == point2.x && point2.x==point3.x)
				{
					throw new collinear();				
				}
				if(point1.y == point2.y && point2.y == point3.y)
				{
					throw new collinear();	
				}
				if(!(getDistance(point1,point2)==getDistance(point1,point3)&&getDistance(point1,point2)==getDistance(point2,point3)))
				{
					throw new notEqual();
				}
			}
			catch(collinear e)
			{	
				correct = 0;
				System.out.printf("\nError : the three vertices are collinear. Please enter non-collinear vertices\n");
			}
			catch(notEqual e)
			{				
				System.out.printf("\nWarning : the three sides are not equal, but continue your operation\n");
			}
		}
		
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		
	}
	
	public void getter()
	{
		System.out.printf("\n\nType of shape : Equilateral Triangle\n");
		System.out.printf("\t¡ÜCoordinates of Vertex One : %.1f, %.1f\n",this.point1.x,this.point1.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Two : %.1f, %.1f\n",this.point2.x,this.point2.y);
		System.out.printf("\t¡ÜCoordinates of Vertex Three : %.1f, %.1f\n",this.point3.x,this.point3.y);
		System.out.printf("\t¡ÜLength of side 1 : %.1f\n",getDistance(this.point1,this.point2));
		System.out.printf("\t¡ÜLength of side 2 : %.1f\n",getDistance(this.point1,this.point3));
		System.out.printf("\t¡ÜLength of side 3 : %.1f\n",getDistance(this.point2,this.point3));
		System.out.printf("\t¡ÜSurface Area : %.1f\n",getArea(this.point1,this.point2,this.point3));		
	}	
}
