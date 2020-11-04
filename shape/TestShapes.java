package lab11;



public class TestShapes {

	public static void main(String[] args) {
		
		EquilateralTriangle et = new EquilateralTriangle();
		System.out.printf("  === Equilateral Triangle ===\n");
		et.setter();
		
		Square sq = new Square();
		System.out.printf("\n\n  === Square ===\n");
		sq.setter();
		
		EquilateralTriangularPrism etpm = new EquilateralTriangularPrism();
		System.out.printf("\n\n  === Equilateral Triangular Prism ===\n");
		etpm.setter();
		
		SquarePrism sqpm = new SquarePrism();
		System.out.printf("\n\n  === Square Prism ===\n");
		sqpm.setter();
		
		EquilateralTriangularPyramid etpd = new EquilateralTriangularPyramid(); 
		System.out.printf("\n\n  === Equilateral Triangular Pyramid ===\n");
		etpd.setter();
		
		SquarePyramid sqpd = new SquarePyramid();
		System.out.printf("\n\n  === Square Pyramid ===\n");
		sqpd.setter();		
		
		et.getter();		
		sq.getter();		
		etpm.getter();		
		sqpm.getter();		
		etpd.getter();		
		sqpd.getter();
	}

}
