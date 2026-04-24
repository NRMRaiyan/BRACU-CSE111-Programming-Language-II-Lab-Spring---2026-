//TestAccount class
public class TestAccount{
  public static void main(String [] args){
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
    CheckingAccount c1 = new CheckingAccount();
    System.out.println("Account Balance: " + c1.showBalance());
    CheckingAccount c2 = new CheckingAccount(100.0);
    System.out.println("Account Balance: " + c2.showBalance());
    CheckingAccount c3 = new CheckingAccount(200.0);
    System.out.println("Account Balance: " + c3.showBalance());
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
  }
}

//Account class
public class Account{
  public double balance = 0.0;
  
  public Account(double balance){
    this.balance = balance;
  }
  public double showBalance(){
    return balance;
  }
}

//CheckingAccount child Class
class CheckingAccount extends Account{
   public static int count = 0;
   
   public CheckingAccount(){
     super(0.0);
     count++;
   }

  public CheckingAccount(double balance){
    super(balance);
    count++;
  }
}
