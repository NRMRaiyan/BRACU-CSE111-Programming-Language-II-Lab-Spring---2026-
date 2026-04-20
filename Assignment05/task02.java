//Character Class
public class Character{
  
  public String name;
  public String catagory;
  public int health;
  public int id = 0;
  
  public static int kids = 0;
  public static int teens = 0;
  public static int adults = 0;
  public static int total = 0;
  public static int totalHealth = 0;
  public static String strongestName = "None";
  public static int maxHealth = 0;
  
  public Character(String nm, String ct, int ht){
    this.name = nm;
    this.catagory = ct;
    this.health = ht;
    
    totalHealth += ht;
    total++;
    id = total;
    
    if(ct.equals("Kid")){
      Character.kids++;
    }else if(ct.equals("Adult")){
      Character.adults++;
    }
    
    if(ht > maxHealth){
      strongestName = nm;
      maxHealth = ht;
    }
  }
  
  public Character(String nm, int ht){
    this.name = nm;
    this.catagory = "Teen";
    this.health = ht;
    Character.teens++;
    
    totalHealth += ht;
    total++;
    id = total;
    
    if(ht > maxHealth){
      strongestName = nm;
      maxHealth = ht;
    }
  }
  
  public static void printStats(){
    System.out.println("Total Characters: " + total);
    System.out.println("Kids: " + Character.kids);
    System.out.println("Teens: " + Character.teens);
    System.out.println("Adults: " + Character.adults);
    
    double avg = 0;
    if(total > 0){
      avg = (double) totalHealth / total;
    }
    
    if(avg == 0.0){
      System.out.println("Average Health: 0" );
    }else{
      System.out.println("Average Health: " + avg);
    }
    
    
    if(total == 0){
      System.out.println("Strongest Character: None");
    }else{
      System.out.println("Strongest Character: ");
      System.out.println(strongestName + " (Health " + maxHealth + ")");
    }
  }
  
  public void printDetails(){
    System.out.println("ID: " + id + ", Name: " + this.name);
    System.out.println("Group: " + this.catagory);
    System.out.println("Health: " + this.health);
  }
}

//WeirderStuffTester Class
public class WeirderStuffTester {
  public static void main(String[] args) {
    Character.printStats();
    System.out.println("---------1-----------");
    Character twelve = new Character("Twelve", "Kid", 100);
    twelve.printDetails();
    System.out.println("---------2-----------");
    Character spike = new Character("Spike", "Kid", 50);
    spike.printDetails();
    System.out.println("---------3-----------");
    Character.printStats();
    System.out.println("---------4-----------");
    Character reeve = new Character("Reeve", 70);
    reeve.printDetails();
    System.out.println("---------5-----------");
    Character chopper = new Character("Chopper", "Adult", 120);
    chopper.printDetails();
    System.out.println("---------6-----------");
    Character.printStats();
  }
}
