//Toy Class
public class Toy{
  public String carName;
  public int carPrice;
  
  public Toy(String name, int price){
    carName = name;
    carPrice = price;
    System.out.println("A new toy has been made!");
  }
  
  public int updatePrice(int price){
    carPrice = price;
    return price;
  }
  
  public void showPrice(){
    System.out.println("price: " + carPrice + " Taka");
  }
  
  public void updateName(String name){
    
    System.out.println("Changing old name: " + carName);
    carName = name;
    System.out.println("new name: " + name);
  }
}

//ToyTester Class
public class ToyTester{
  public static void main(String [] args){
    Toy t1 = new Toy("Car", 230);
    System.out.println("1=================");
    t1.updatePrice(250);
    System.out.println("2=================");
    System.out.println(t1.carName);
    t1.showPrice();
    System.out.println("3=================");
    Toy t2 = new Toy("Robot", 450);
    System.out.println("4=================");
    t2.updateName("Autobot");
    System.out.println("5=================");
    System.out.println(t2.carName);
    t2.showPrice();
  }
}
