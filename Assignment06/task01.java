//Animal Class
public class Animal{ 
  public int legs = 4;
  public String sound = "Not defined";
  
  public void details(){
    System.out.println("Legs: "+legs);
    System.out.println("Sound: "+sound);
  }
}

//AnimalTester2 Class
public class AnimalTester2 {
  public static void main(String args[]){
    Animal a1 = new Animal();
    System.out.println("1-------------");
    a1.details();
    System.out.println("2-------------");
    Cow c1  = new Cow();
    c1.name = "Pammy";
    System.out.println("3-------------");
    System.out.println("Name: " + c1.getName());
    c1.details();
    System.out.println("4-------------");
    c1.updateSound("Moo");
    System.out.println("5-------------");
    c1.details();
  }
}

//Cow child Class
public class Cow extends Animal{
    public String name;
    
    public Cow(){
      System.out.println("The cow says hello!");
    }
    
    public Cow(String name){
      this.name = name;
    }
    
    public String getName(){
      return this.name;
    }
    
    public void updateSound(String sound){
      super.sound = sound;
    }
}
