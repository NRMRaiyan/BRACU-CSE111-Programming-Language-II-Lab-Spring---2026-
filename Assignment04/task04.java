//Spaceship Class
public class Spaceship{
  public String shipName;
  public int shipCapacity;
  public Cargo [] cargo = new Cargo[100];
  public int count = 0;
  public int cargoWeight;
  
  public Spaceship(String name, int capacity){
    this.shipName = name;
    this.shipCapacity = capacity;
  }
  
  public void loadCargo(Cargo obj){
    cargo[count] = obj;
    this.cargoWeight += cargo[count].getCargoWeight();
    
    if(cargoWeight > shipCapacity){
      System.out.println("Warning: Unable to load " + obj.getCargoName() + " inside " + shipName + ". Exceeds capacity by " + (cargoWeight - shipCapacity));
    }
    count++;
  }
  
  public void displayDetails(){
    System.out.println("Spaceship Name: " + this.shipName);
    System.out.println("Capacity: " + this.shipCapacity);
    System.out.println("Current Cargo Weight: " + this.cargoWeight);
    System.out.print("Cargo:");
    
    for(int i = 0; i < count; i++){
      System.out.print(cargo[i].getCargoName() + " ");
    }
    System.out.println();
  }
  
}

class Cargo{
  private String cargoName;
  private int cargoWeight;
  
  public Cargo(String name, int weight){
    this.cargoName = name;
    this.cargoWeight = weight;
  }
  
  public String getCargoName(){
    return this.cargoName;
  }
  
  public int getCargoWeight(){
    return this.cargoWeight;
  }
}

//ShipTester Class
public class ShipTester {
 public static void main(String[] args) {
  Spaceship falcon = new Spaceship("Falcon", 50000);
  Spaceship apollo = new Spaceship("Apollo", 100000);
  Spaceship enterprise = new Spaceship("Enterprise",220000);      
  System.out.println("1.===========");
  Cargo gold = new Cargo("Gold", 20000);
  Cargo platinum = new Cargo("Platinum", 25000);
  Cargo dilithium = new Cargo("Dilithium", 50000);
  Cargo trilithium = new Cargo("Trilithium", 70000);
  Cargo neutronium = new Cargo("Neutronium", 80000);
  System.out.println("2.===========");
  falcon.loadCargo(gold);
  falcon.loadCargo(platinum);
  falcon.displayDetails();
  System.out.println("3.===========");
  apollo.loadCargo(gold);
  apollo.displayDetails();
  System.out.println("4.===========");
  falcon.loadCargo(neutronium);
  System.out.println("5.===========");
  enterprise.loadCargo(dilithium);
  enterprise.loadCargo(trilithium);
  enterprise.loadCargo(neutronium);
  enterprise.displayDetails();
 }
}
