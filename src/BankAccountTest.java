
public class BankAccountTest {

	public static void main(String[] args) {
		//Creating Accounts and testing the number of Accounts
		BankAccount ricardoAccount = new BankAccount();
		System.out.println(ricardoAccount.getNumOfAccounts());
		BankAccount mariaAccount = new BankAccount();
		System.out.println(mariaAccount.getNumOfAccounts());
		
		//Testing out adding money to checking and savings
		ricardoAccount.setCheckingBalance(2500);
		ricardoAccount.setSavingsBalance(500);
		System.out.println("Checking Account Balanece: " + ricardoAccount.getCheckingBalance());
		System.out.println("Savings Account Balance: " + ricardoAccount.getSavingsBalance());

		//Testing out the Withdraw methods
		ricardoAccount.withdrawChecking(3000);
		ricardoAccount.withdrawSavings(100);
		System.out.println("Checking Account Balanece: " + ricardoAccount.getCheckingBalance());
		System.out.println("Savings Account Balance: " + ricardoAccount.getSavingsBalance());
		
		//Test total amount for all accounts
		System.out.println("Total amount from Checking and Savings: " + ricardoAccount.getTotalAmount());
	}

}
