//VehicleShowroom Class
public class VehicleShowroom {
  public static void main(String[] args) {
    Car c1 = new Car("Toyota Camry", 25000, 4);
    System.out.println("--------1---------");
    c1.vehicleDetail();
    System.out.println("--------2---------");
    Car.showAllAvailableCars();
    System.out.println("--------3---------");
    Car c2 = new Car("Honda Civic", 22000, 4);
    Car c3 = new Car("Ford Mustang", 35000, 2);
    Car.markAsSold(c1);
    Car.markAsSold(c2);
    System.out.println("--------4---------");
    c2.vehicleDetail();
    System.out.println("--------5---------");
    Car.showAllCars();
    System.out.println("--------6---------");
    ElectricCar e1 = new ElectricCar("Tesla Model 3", 45000, 75);
    ElectricCar e2 = new ElectricCar("Nissan Leaf", 32000, 60);
    ElectricCar e3 = new ElectricCar("Nissan Leaf", 32000, 60);
    System.out.println("--------7---------");
    e1.vehicleDetail();
    System.out.println("--------8---------");
    e3.vehicleDetail();
    System.out.println("--------9---------");
    ElectricCar.markAsSoldEV(e1);
    ElectricCar.markAsSoldEV(e2);
    ElectricCar.markAsSoldEV(e3);
  }
}

//Vehicle Parent Class
public class Vehicle {
  public String model;
  public int price;
  public boolean sold;
  public String vehicleId; 
  public Vehicle(String model, int price) {
    this.model = model;
    this.price = price;
    this.sold = false;
    this.vehicleId = "";
  } 
  public void vehicleDetail() {
    System.out.println("Model: " + model + ", Price: $" + price);
    System.out.print("Status: ");
    if(sold){
      System.out.print("Sold\n");
    }
    else{
      System.out.print("Available\n");
    }
  }
}

//Car Child Class
public class Car extends Vehicle{
    public static int cars = 0;
    public int seats;

    public static Car[] availableCars = new Car[10];

    public Car(String name, int price, int seat){
        super(name, price);
        this.seats = seat;
        cars++;
        this.vehicleId = "CAR00" + cars;
        availableCars[cars - 1] = this;
        System.out.println("Vehicle ID: " + vehicleId + " created");
    }

    @Override
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Regular Car");
        System.out.println("Seats: " + seats);
    }

    public static void showAllAvailableCars(){
        System.out.println("Total Car: " + cars);

        System.out.println("Available Caars:");
        for(int i = 0; i < cars; i++){
            System.out.println(availableCars[i].vehicleId + " : " + availableCars[i].model);
        }
    }

    public static void markAsSold(Car c){
        c.sold = true;
    }

    public static void showAllCars(){
        System.out.println("Total Car: " + cars);
        for(int i = 0; i < cars; i++){
            String status;
            if(availableCars[i].sold){
                status = "sold";
            }else{
                status = "available";
            }
            System.out.println(availableCars[i].vehicleId + ": " + availableCars[i].model + " - " + status);
        }
    }
}

//ElectricCar Child Class
public class ElectricCar extends Vehicle{
    public static int cars = 0;
    public int batteryCapacity;
    public static ElectricCar[] ev = new ElectricCar[10];

    public ElectricCar(String name, int price, int battery){
        super(name, price);
        vehicleId = "EV000";
        batteryCapacity = battery;

        System.out.println("Vehicle ID: " + vehicleId + " created");
    }

    @Override
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public static void markAsSoldEV(ElectricCar e){
        e.sold = true;
    }
}
