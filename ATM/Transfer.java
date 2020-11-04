package ATM;

public class Transfer extends Transaction {

	   private boolean userAuthenticated;	
	   private int currentAccountNumber;
	   private double amount; 
	   private Keypad keypad; 	   
	   private final static int CANCELED = 0;	   
	   public Transfer(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad)
	   {
	      super(userAccountNumber, atmScreen, atmBankDatabase);		      
	      keypad = atmKeypad;	      
	   } 
	public void execute() {		  
		
	      double availableBalance;	      
	      BankDatabase bankDatabase = getBankDatabase(); 
	      Screen screen = getScreen();	      
	     	          
	      amount = displayMenuOfTransferAmounts();	         
	         
	      if (amount != CANCELED)
	      {	            
	          availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());	      
	           
	          if (amount <= availableBalance)
	          {   
	        	  screen.displayMessage("\nPlease enter receipent account number: ");
	    	      int recipientAccountNumber = keypad.getInput();	    	      	    	      
	    	      
	    	      userAuthenticated =  bankDatabase.getAvailableRecipient(recipientAccountNumber);	    	      
	    	      
	    	      if (userAuthenticated)
	    	      {
	    	         currentAccountNumber = recipientAccountNumber; 
	    	         
	    	         bankDatabase.debit(getAccountNumber(), amount);
	    	         bankDatabase.credit(recipientAccountNumber,amount);
	    	         screen.displayMessageLine("\nTransfer Success!!. Thank you :)");	    	         
	    	         
	    	      } 
	    	      else
	    	         screen.displayMessageLine("Invalid recipient account number. Please try again.");	              
	          }
	          else 
	          {
	             screen.displayMessageLine("\nInsufficient funds in your account." + "\n\nPlease enter a smaller amount."); 
	          } 
	       } 
	       else 
	       {
	          screen.displayMessageLine("\nCanceling transaction...");
	          return; 
	       } 
	   } 
	   
	   private double displayMenuOfTransferAmounts()
	   {
		      Screen screen = getScreen(); 		      
		      screen.displayMessage("\nPlease enter a transfer amount in " + 
		         "CENTS (or 0 to cancel): ");
		      int input = keypad.getInput();		      
		      if (input == CANCELED) 
		         return CANCELED;
		      else
		      {
		         return (double) input / 100; 
		      } 
	   }
}
