//CardTester Class
public class CardTester{
  public static void main(String[] args) {
    CreditCard card1 = new PlatinumCard("Ali", "345 127");
    CreditCard card2 = new SignatureCard("Rahul", "514 123");
    CreditCard card3 = new SignatureCard("Rohan", "147 965");
    CreditCard [] cards = {card1, card2, card3};
    for (int i = 0; i<cards.length; i++)
    {
      System.out.println("================");
      if (cards[i] instanceof SignatureCard)
      {
        SignatureCard new_card = (SignatureCard) cards[i];
        new_card.spendCash(500);
      }
      else if (cards[i] instanceof PlatinumCard)
      {
        PlatinumCard new_card = (PlatinumCard) cards[i];
        new_card.spendCash(200);
      }
      System.out.println("================");
      cards[i].cardDetails();
    }
  }
}

//CreditCard Parent Class
public class CreditCard {
   public String cardHolder;
   public String accountNo;
   public int rewardPoints;
   public CreditCard(String cardHolder, String accountNo, int rewardPoints){
       this.cardHolder = cardHolder;
       this.accountNo = accountNo;
       this.rewardPoints = rewardPoints;
   }
   public void cardDetails(){
       System.out.println("Card Holder Name: " + cardHolder);
       System.out.println("Account Number: " + accountNo);
       System.out.println("Reward point gained: " + rewardPoints);
   }
}

//PlatinumCard Child Class
public class PlatinumCard extends CreditCard{
  
  public PlatinumCard(String name, String accNo){
    super(name, accNo, 100);
  }
  
  public void spendCash(int cash){
    System.out.println("Previous Reward Points: " + rewardPoints);
    
    rewardPoints = rewardPoints + ((cash / 100) * 2);
    
    System.out.println("Reward points after spending " + cash + " taka: " + rewardPoints);
  }
}

//SignatureClass Child Class
public class SignatureCard extends CreditCard{
  
  public int companions = 5;
  
  public SignatureCard(String name, String accNo){
    super(name, accNo, 200);
  }
  
  public void spendCash(int cash){
    System.out.println("Previous Reward Points: " + rewardPoints);
    
    rewardPoints = rewardPoints + ((cash / 100) * 4);
    
    System.out.println("Reward points after spending " + cash + " taka: " + rewardPoints);
  }
  
  @Override
  public void cardDetails(){
    super.cardDetails();
    System.out.println("Possiblel Number of Companions for Lounge: " + this.companions);
  }
}
