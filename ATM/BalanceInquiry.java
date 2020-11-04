package ATM;

public class BalanceInquiry extends Transaction {

	 public BalanceInquiry(int userAccountNumber, Screen atmScreen, 
		      BankDatabase atmBankDatabase)
		   {
		      super(userAccountNumber, atmScreen, atmBankDatabase);
		   } // end BalanceInquiry constructor
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		// get references to bank database and screen
	      BankDatabase bankDatabase = getBankDatabase();
	      Screen screen = getScreen();

	      // get the available balance for the account involved
	      double availableBalance = 
	         bankDatabase.getAvailableBalance(getAccountNumber());

	      // get the total balance for the account involved
	      double totalBalance = 
	         bankDatabase.getTotalBalance(getAccountNumber());
	      
	      // display the balance information on the screen
	      screen.displayMessageLine("\nBalance Information:");
	      screen.displayMessage(" - Available balance: "); 
	      screen.displayDollarAmount(availableBalance);
	      screen.displayMessage("\n - Total balance:     ");
	      screen.displayDollarAmount(totalBalance);
	      screen.displayMessageLine("");
	   } // end method execute

}
