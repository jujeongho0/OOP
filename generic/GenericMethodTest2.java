package Lab12_3;

public class GenericMethodTest2 {

	public static void main(String[] args) {
		 // create arrays of Integer, Double and Character
	      Integer[] integerArray = {1, 2, 3, 4, 5};
	      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
	      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
	      String[] stringArray = {"one", "two", "three", "four", 
	         "five", "six", "seven", "eight"};

	      System.out.println("Array integerArray contains:");
	      printArray(integerArray); // call generic with an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray); // call generic with a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(characterArray); // call generic with a Character array

	      System.out.println("\nArray stringArray contains:");
	      printArray(stringArray); // method specific to string arrays
	   }
	   
	   // generic method printArray
	   public static <T> void printArray(T[] inputArray)
	   {
		   for(int i=0;i<inputArray.length;i++)
			   System.out.printf("%s ",inputArray[i]);
		   
		   System.out.printf("\n");	      
	   } 

	   // method that prints array of strings in tabular format
	   public static void printArray(String[] stringArray)
	   {
		   for(int i=0;i<4;i++)
			   System.out.printf("%s ",stringArray[i]);
		   
		   System.out.printf("\n");	
		   
		   for(int i=4;i<stringArray.length;i++)
			   System.out.printf("%s ", stringArray[i]);   
		  
	   }
}