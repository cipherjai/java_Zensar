public class Account
{
	
	// instance variable

	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;


	public void setAccount(int accNumber, String accHolderName, double accBalance)
	{
		accountNumber = accNumber;
		accountHolderName = accHolderName;
		accountBalance = accBalance;
	}

	public void withdraw(double withdrawAmount)
	{
		accountBalance  = accountBalance - withdrawAmount;
	}

	public void credit(double creditAmount)
	{
		accountBalance = accountBalance - creditAmount;
	}

	public double showBalance()
	{
		//System.out.println("The account balance for account number "+ accountNumber +" is "+accountBalance+".");
		return accountBalance;
	}

	public static void main(String[] args) 
	{
		Account account = new Account();
		System.out.println("Set the account");
		account.setAccount(918282, "Rhythm", 122345.98);
		System.out.println("The balance in account is : "+account.showBalance());
		account.withdraw(12000.67);
		System.out.println("The balance in account after withdraw is : "+account.showBalance());
		account.credit(24000.56);
		System.out.println("The balance in account after credit is : "+account.showBalance());
	}
}