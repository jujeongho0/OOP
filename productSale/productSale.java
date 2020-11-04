package HW3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		
		  
		   int[] unitPrice = {10,20,30,40,50,60,70,80,90,100};
		   int[] unitQuantity= {50,50,50,50,50,50,50,50,50,50};
		   int askProduct=0;
		   int askQuantity=0;		   
		   int askMore = 0;
		   int totalPrice = 0;
		   int check = 0;
		   int choice = 0;
		   		   
		   Scanner scan = new Scanner(System.in);
		   
		   while(check != 3)
		   {
			   System.out.printf("\n1 : View the unit price\n");
			   System.out.printf("2 : Add a purchasing product\n");
			   System.out.printf("3 : Calculate the total price\n");
			   System.out.printf("\nWhat do you want?(1~3) : ");
			   choice = scan.nextInt();
			   if(choice == 1)
			   {
				   System.out.printf("\n<Unit Price>\n");
				   for(int i=0;i<10;i++)
				   {
					   System.out.printf("%d type product's price : < %d >\n", i+1,unitPrice[i]);				   
				   }
				   check = 1;
				   
			   }
			   else if(choice == 2)
			   {
				   System.out.printf("\nWhat type of product do you want?(1~10) : ");
				   askProduct = scan.nextInt();
				   System.out.printf("\n%d type product's price is < %d >\n",askProduct,unitPrice[askProduct-1]);
				   System.out.printf("\nHow many do you want? : ");
				   askQuantity = scan.nextInt();
		   
		   
				   if(unitQuantity[askProduct-1] < askQuantity)
				   {			   
					   System.out.printf("\nThe product is out of stock!!\n");
				   }
				   else
				   {				   
					   totalPrice += unitPrice[askProduct-1]*askQuantity;
					   unitQuantity[askProduct-1] -= askQuantity;
				   }
				   check = 2;
			   }
			   else
				   check = 3;
		   }	   
		   System.out.printf("\n\nTotal Price is   < %d >\nThank you :)",totalPrice);		   
	}
}