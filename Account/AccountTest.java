package HW4_1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green",50.00);
		Account account2 = new Account("John Blue",-7.53);
		
		System.out.printf("%d , %d%n", account1.getAccountNumber(),account2.getAccountNumber());
		System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

		Scanner input = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
		
		System.out.printf("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
		
		System.out.print("Enter transfer amount from account1 to account2 : ");
		double amt = input.nextDouble();
		if(account1.transfer(account2, amt)==true) {
			System.out.printf("%nsubtracting %.2f to account1 balance%n%n", amt);
		}
		else
		{
			System.out.printf("%ntransfer amount is bigger than account1 balance!%n%n");
		}
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
		
		System.out.print("Enter transfer amount from account2 to account1 : ");
		amt = input.nextDouble();
		if(account2.transfer(account1, amt)==true) {
			System.out.printf("%nsubtracting %.2f to account2 balance%n%n", amt);
		}
		else
		{
			System.out.printf("%ntransfer amount is bigger than account2 balance!%n%n");
		}
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
	
	}
}
