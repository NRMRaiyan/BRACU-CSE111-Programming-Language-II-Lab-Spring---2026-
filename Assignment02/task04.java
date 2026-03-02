//MobilePhone Class
public class MobilePhone{
  
  public int totalContacts;
  public int counter = 0;
  
  public String [] personNames;
  public int [] personNumbers;
  
  public void setContactCapacity(int capacity){
    totalContacts = capacity;
    personNames = new String [totalContacts];
    personNumbers = new int [totalContacts];
  }
  
  public void details(){
    System.out.println("Total Contacts: " + counter);
    System.out.println("Contact List:");
      
    for(int i = 0; i < counter; i++){
      System.out.println(personNames[i] + ":" + personNumbers[i]);
    }
  }
  
  public void addContact(String names, int numbers){
    if(counter < totalContacts){
      personNames[counter] = names;
      personNumbers[counter] = numbers;
      counter++;
      System.out.println("The contact of " + names + " is added.");
    }else{
      System.out.println("Storage Full!!");
    }
  }
  
  public void makeCall(int number){
    
    for(int i = 0; i < counter; i++){
      if(personNumbers[i] == number){
        System.out.println("Calling " + personNames[i] + " . . .");
        return;
      }
    }
    
    System.out.println("Calling " + number + " . . .");
  }
}

//MobilePhoneTester Class
public class MobilePhoneTester{
  public static void main(String [] args){
    
    MobilePhone m1 = new MobilePhone();
    MobilePhone m2 = new MobilePhone();
    
    m1.setContactCapacity(5);
    m2.setContactCapacity(100);
    
    m1.details();
    
    System.out.println("1----------------");
    
    m1.addContact("John", 9866);
    m1.addContact("Maria", 7865);
    
    System.out.println("2----------------");
    
    m1.details();
    
    System.out.println("3----------------");
    
    m1.makeCall(9866);
    
    System.out.println("4----------------");
    
    m1.addContact("Henry", 2365);
    
    System.out.println("5----------------");
    
    m1.makeCall(7552);
    m1.makeCall(2365);
    
    System.out.println("6----------------");
    
    m1.addContact("Gomes", 4589);
    m1.addContact("Antony", 8421);
    m1.addContact("Tony", 5789);
    
    System.out.println("7----------------");
    
    m1.details();
  }
}
