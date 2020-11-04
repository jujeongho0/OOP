package Lab13_6;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.StringTokenizer;

public class TreeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // create scanner

	      System.out.println("Please enter a line of text:");
	      String input = scanner.nextLine(); // get input text

	      TreeSet<String> tree = new TreeSet<String>();
	      StringTokenizer tokenizer = new StringTokenizer(input," ");
	    
	      while (tokenizer.hasMoreTokens())  
	      {
	        tree.add(tokenizer.nextToken());
	      
	        System.out.println("Elements in tree: " + tree);  
	      }	      
	     
	      System.out.println("Elements in tree: " + tree);

	}

}
