package HW4_1;

public class Account {

	private String name;
	private double balance;
	private int accountNumber;
	static private int initialAccountNumber = 1000;
	
	public Account(String name, double balance)
	{

		this.name = name;
		
		if(balance > 0.0)
			this.balance = balance;
		
		accountNumber = getInitialAccountNumber();

	}
	
	private int getInitialAccountNumber()
	{
		return ++initialAccountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void deposit(double depositAmount)
	{
		if(depositAmount>0.0)
			balance=balance+depositAmount;
	
	}
	
	boolean transfer(Account b,double amt)
	{
		if(balance>=amt)
		{
			balance -= amt;
			b.deposit(amt);
			return true;
		}
		else
			return false;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

}
