//Caterpillar_Tester Class
public class Caterpillar_Tester {
  public static void main(String[] args) {
    Caterpillar c = new Caterpillar("Leaf", 5);
    c.showDetails();
    System.out.println("--------------1-------------");
    c.eat();
    c.eat(3);
    c.showDetails();
    System.out.println("--------------2-------------");
    Butterfly b = new Butterfly("Flower", 2);
    Moth m = new Moth("Cotton", 4);    
    System.out.println("--------------3-------------");
    b.transform();
    m.transform();
    System.out.println("--------------4-------------");
    b.eat(2);        
    m.eat(5);        
    System.out.println("--------------5-------------");
    b.showDetails();
    m.showDetails();   
  }
}

//Caterpillar Parent Class
public class Caterpillar {
  public String food;
  public int age;
  public double energy;
  
  public Caterpillar(String food, int age) {
    this.food = food;
    this.age = age;
    this.energy = 0;
  }
  
  public void eat() {
    energy += 1;
    System.out.println("Caterpillar ate 1 unit of food");
  }
  
  public void eat(int amount) {
    energy += amount;
    System.out.println("Caterpillar ate " + amount + " units of food");
  }
  
  public void transform() {
    System.out.println("Caterpillar transforms");
  }
  
  public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy);
  }
}

//Butterfly Child Class
public class Butterfly extends Caterpillar{
  
  public Butterfly(String name, int age){
    super(name, age);
  }
  
  @Override
  public void transform(){
    System.out.println("Caterpillar transforms into Butterfly");
  }

  @Override
  public void eat(int amount){
    energy += (amount * 5) - 5;
    System.out.println("Butterfly lost energy while flying and absorbed nectar");
  }

  @Override
  public void showDetails(){
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
  }
}

//Moth Child Class
public class Moth extends Caterpillar{
  
  public Moth(String name, int age){
    super(name, age);
  }
  
  @Override
  public void transform(){
    System.out.println("Caterpillar transforms into Moth");
  }

  @Override
  public void eat(int amount){
    energy += (amount * 2.5) - 2.5;
    System.out.println("Moth lost energy due to nocturnal activity");
  }

  @Override
  public void showDetails(){
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
  }
}
