//MoneTracker Class
public class MoneyTracker{
  
  public String personName = null;
  public double currentBalance = 0.0;
  
  public double lastAdded = 0.0;
  public double lastSpent = 0.0;
  
  public MoneyTracker(){
    System.out.println("A new money tracker has been launched.");
  }
  
  public String info(){
    String trackerInfo = "Name: " + personName + "\n" + "Current Balance: " + currentBalance;
    return trackerInfo;
  }
  
  public void createTracker(String name){
    personName = name;
    currentBalance = 1.0;
  }
  
  public void income(int inc){
    currentBalance += inc;
    System.out.println("Balance Updated!");
    lastAdded = inc;
  }
  
  public void expense(int exp){
    if(currentBalance < exp){
      System.out.println("Not enough balance.");
    }else{
      currentBalance -= exp;
      lastSpent = exp;
      
      if(currentBalance == 0){
        System.out.println("You're broke!");
      }else{
        System.out.println("Balance Updated.");
      }
    }
  }
  
  public void showHistory(){
    System.out.println("Last added: " + lastAdded);
    System.out.println("Last spent: " + lastSpent);
  }
}

//Tester4 Class
public class Tester4{
  public static void main(String [] args){
    MoneyTracker tr1 = new MoneyTracker();
    System.out.println(tr1.info());
    tr1.createTracker("John");
    System.out.println("1 ==========");
    System.out.println(tr1.info());
    System.out.println("2 ==========");
    tr1.income(1000);
    System.out.println(tr1.info());
    System.out.println("3 ==========");
    tr1.expense(800);
    tr1.expense(100);
    System.out.println(tr1.info());
    System.out.println("4 ==========");
    tr1.showHistory();
    System.out.println("5 ==========");
    tr1.expense(101);
    System.out.println("6 ==========");
    tr1.expense(200);
    System.out.println("7 ==========");
    tr1.income(200);
    tr1.showHistory();
    System.out.println("8 ==========");
  }
}
