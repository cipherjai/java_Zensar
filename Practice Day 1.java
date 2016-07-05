public class Account
{
  private String accountNumber;
  private String accountHolderName;
  private double accountBalance;

  public void setAccountNumber(String accNumber)
  {
    accountNumber = accNumber ;
  }

  public void setAccountHolderName(String accHolderName)
  {
    accountHolderName = accHolderName ;
  }
  
  public void setAccountBalance(double accBalance)
  {
    accountBalance = accBalance ;
  }

  public String getAccountNumber()
  {
    return accountNumber;
  }

  public String getAccountHolderName()
  {
    return accountHolderName;
  }

  public double getAccountBalance()
  {
  	return accountBalance;
  }

  
  public static void main(String[] args) 
  {
    Account account = new Account();
    System.out.println("Setting account number !");    
    account.setAccountNumber("12323");
    System.out.println("Setting account holder name !");
    account.setAccountHolderName("Jai Gupta");
    System.out.println("Entering amount in Balance !");
    account.setAccountBalance(12000000.0);
    System.out.println(getAccountBalance);
    System.out.println(getAccountNumber);
    System.out.println(getAccountHolderName);
  }
}