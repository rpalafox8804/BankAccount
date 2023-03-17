/**
 * 
 */

/**
 * @author ricardopalafox
 *
 */
//bank account class
public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int numOfAccounts = 0;
	private static double totalAmount = 0;
	
	//constructor for bank account
	public BankAccount() {
		numOfAccounts++;
	}
	
	//Get Checking Account Balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	//Set Checking Account Balance and add to total
	public void setCheckingBalance(double deposit) {
		checkingBalance += deposit;
		totalAmount += deposit;
	}
	
	//Get Savings Account Balance
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	//Set Savings Account Balance and add to total
	public void setSavingsBalance(double deposit) {
		savingsBalance += deposit;
		totalAmount += deposit;
	}
	
	//Get Total Account Balance from both accounts
	public double getTotalAmount() {
		return totalAmount;
	}
	
	//Get Total number of accounts
	public double getNumOfAccounts() {
		return numOfAccounts;
	}
	
	//Withdraw method  for Checking account that only allows you to do so if you have the funds. 
	public void withdrawChecking(double amountWithdrawn) {
		if (amountWithdrawn > checkingBalance) {
			System.out.println("Insufficient funds, you only have " +checkingBalance);
		}
		else {
			checkingBalance -= amountWithdrawn;
			totalAmount -= amountWithdrawn;
			System.out.println("Withdraw was successful. You now have a balance of " +checkingBalance);
		}
			
	}
	
	//Withdraw method  for Savings account that only allows you to do so if you have the funds. 
	public void withdrawSavings(double amountWithdrawn) {
		if (amountWithdrawn > savingsBalance) {
			System.out.println("Insufficient funds, you only have " +savingsBalance);
		}
		else {
			savingsBalance -= amountWithdrawn;
			totalAmount -= amountWithdrawn;
			System.out.println("Withdraw was successful. You now have a balance of " + savingsBalance);
		}
				
	}
	
}
