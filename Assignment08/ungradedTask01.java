//VehicleTester Class
public class VehicleTester{
  public static void main(String [] args){
    Garage g = new Garage(2, 3);
    System.out.println("==========0===========");
    Vehicle vC1 = new Car("Ford", "Mustang", 2022, 2, 4, false);
    Vehicle vC2 = new Car("Tesla", "Model S", 2025, 4, 4, true);
    Vehicle vC3 = new Car("Reliant", "Robin", 1981, 2, 3, false);
    System.out.println("==========1===========");
    System.out.println(vC1);
    System.out.println("==========2===========");
    g.addVehicle(vC1);
    g.addVehicle(vC2);
    g.addVehicle(vC3);
    System.out.println(g.cars[1]);
    System.out.println("==========3===========");
    g.cars[0].startAutoPilot();
    g.cars[1].startAutoPilot();
    System.out.println("==========4===========");
    Vehicle vB1 = new Bike("Honda", "Gold Wing", 2022, 3, true);
    System.out.println(vB1);
    g.addVehicle( vB1 );
    System.out.println("==========5===========");
    Vehicle vB2 = new Bike("Royal Enfield", "Classic 350", 2021, 2, false);
    g.addVehicle( vB2 );
    System.out.println(g.bikes[1]);
    System.out.println("==========6===========");
    Vehicle vB3 = new Bike("Harley-Davidson", "Street 750", 2022, 2, false);
    g.addVehicle( vB3 );
    Vehicle vB4 = new Bike("Yamaha", "MT-15", 2023, 2, false);
    g.addVehicle( vB4 );
    System.out.println("=========7============");
    g.bikes[0].doAWheelie();
    g.bikes[1].doAWheelie();
  }
}

//Garage Class
public class Garage{
  
  public Car[] cars;
  public Bike[] bikes;
  
  public static int carCount = 0;
  public static int bikeCount = 0;
  
  public Garage(int carCapacity, int bikeCapacity){
    cars = new Car[carCapacity];
    bikes = new Bike[bikeCapacity];
    
    System.out.println("Welcome to the Garage");
    System.out.println("Car Capacity: " + cars.length);
    System.out.println("Bike Capacity: " + bikes.length);
  }
  
  public void addVehicle(Vehicle obj){
    
    if(obj instanceof Car){
      if(carCount < cars.length){
        cars[carCount] = (Car) obj;
        carCount++;
        System.out.println("A " + obj.getBrand() + " CAR has been added to the Garage");
      }else{
        System.out.println("Can't add more Cars! Capacity: " + cars.length);
      }
    }else if(obj instanceof Bike){
      if(bikeCount < bikes.length){
        bikes[bikeCount] = (Bike) obj;
        bikeCount++;
        System.out.println("A " + obj.getBrand() + " BIKE has been added to the Garage");
      }else{
        System.out.println("Can't add more bikes! Capacity: " + bikes.length);
      }
    }
  }
}

//Vehicle Parent Class
public class Vehicle {
    
    private String brand;
    private int year, wheels;

    public Vehicle(String b, int y){
        this.brand = b;
        this.year = y;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }

    public void setWheels( int w ){
        this.wheels = w;
    }

    public int getWheels(){
        return this.wheels;
    }

    public String toString(){
        return "Brand: "+this.brand+", Year: "+this.year+", Wheels: "+this.wheels;
    }
}

//Car Child Class
public class Car extends Vehicle{
  
  public String model;
  public int door;
  public boolean AI;
  
  public Car(String brand, String model, int year, int doors, int wheels, boolean AI){
    super(brand, year);
    setWheels(wheels);
    this.model = model;
    this.door = doors;
    this.AI = AI;
  }
  
  public void startAutoPilot(){
    if(AI){
      System.out.println(this.getBrand() + ":" + this.model + " AutoPilot Started");
    }else{
      System.out.println(this.getBrand() + ":" + this.model + " has no NO AutoPilot");
    }
  }
  
  @Override
  public String toString(){
    return "Car Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels() + ", Model: " + model + ", Doors: " + door + ", AI: " + AI;
  }
}

//Bike Child Class
public class Bike extends Vehicle{
  
  public String model;
  public boolean sideCar;
  
  public Bike(String brand, String model, int year, int wheels, boolean sideCar){
    super(brand, year);
    this.model = model;
    this.sideCar = sideCar;
  }
  
  public void doAWheelie(){
    if(sideCar){
      System.out.println("Wheelie Failed. " + this.getBrand()  + ":" + this.model + " has SideCar");
    }else{
      System.out.println(this.getBrand() + ":" + this.model + " is doing Wheelie!!");
    }
  }
  
  @Override
  public String toString(){
    return "Bike Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels() + ", Model: " + model + ", SideCar: " + sideCar;
  }
}
