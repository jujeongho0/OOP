package lab12_2;

public class GenericMethodTest 
{	
	public static void main(String[] args) 
	{
	   // create arrays of Integer, Double and Character
	   Integer[] integerArray = {1, 2, 3, 4, 5};
	   Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
	   Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
	
	   test("integerArray", integerArray);
	   test("doubleArray", doubleArray);
	   test("characterArray", characterArray);
	}

	public static <T> void printArray(T[] Array) 
	{
		for(int i=0;i<Array.length;i++)
			System.out.printf("%s ",Array[i]);
		   
		 System.out.printf("\n");
	   
	} 

	// overload generic method printArray
	public static <T> int printArray(T[] Array, int lowSubscript, int highSubscript) throws InvalidSubscriptException
	{
	   // check if subscript is negative or out of range
	   if (lowSubscript < 0 || highSubscript >= Array.length)
		   throw new InvalidSubscriptException();
	
	   int count = 0;
	
	   // display array
	   for (int i = lowSubscript; i <= highSubscript; i++) 
	   {
	      count++;
	      System.out.printf("%s ", Array[i]);
	   } // end for
	
	   System.out.println();
	   return count;  // number or elements output
	} 

	// generic method that tests both printArray methods
	public static <T> void test(String name, T[] array) 
	{
	   
	   try
	   {
	      int elements = 0;	
	      
	      System.out.println("\n\nUsing original printArray method");
	      printArray(array); 
	      
	      System.out.printf("Array %s contains:\n", name);
	      elements = printArray(array, 0, array.length - 1);
	      System.out.printf("%d elements were output\n", elements);
		      
	      System.out.printf("Array %s from positions 1 to 3 is:\n", name);
	      elements = printArray(array, 1, 3);
	      System.out.printf("%d elements were output\n", elements);
		      
	      System.out.printf("Array %s output with invalid subscripts:\n", name);
	      elements = printArray(array, -1, 10);
	   } 
	   catch(InvalidSubscriptException InvalidSubscriptException)
	   {		  
		   InvalidSubscriptException.printStackTrace();	      
	   } 
	} 	
}

class InvalidSubscriptException extends RuntimeException
{
	// no-argument constructor
	public InvalidSubscriptException()
	{
	   this("Invalid subscript.");
	} 

	//one-argument constructor
	public InvalidSubscriptException(String message)
	{
		super(message);
	} 

	//two-argument constructor
	public InvalidSubscriptException(String message, Throwable cause)
	{
		super(message, cause);
	} 
}
