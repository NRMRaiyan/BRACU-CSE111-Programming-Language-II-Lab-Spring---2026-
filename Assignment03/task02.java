//Task 02
//Cart Class
public class Cart{
  
  public int cartNo;
  public String [] itemName = new String[3];
  public double [] itemPrice = new double[3];
  public int count = 0;
  double discount = 0;
  
  public void create_cart(int n){
    cartNo = n;
  }
  
  public void addItem(String name, double price){
    if(count == 3){
      System.out.println("You already have 3 items on your cart");
    }else{
      itemName[count] = name;
      itemPrice[count] = price;
      count++;
      
      System.out.println(name + " added to cart " + cartNo + ".");
      System.out.println("You have " + count + " item(s) in your cart now.");
    }
  }
  
  public void addItem(double price, String name){
    addItem(name, price);
  }
  
  public void cartDetails(){
    System.out.println("You cart(c" + cartNo + ") :");
    
    double total = 0;
    
    for(int i = 0; i < count; i++){
      System.out.println(itemName[i] + " - " + itemPrice[i]);
      total += itemPrice[i];
    }
    
    System.out.println("Discount Applied: " + discount + "%");
    total = total - (total * discount / 100);
    System.out.println("Total price: " + total);
  }
  
  public void giveDiscount(double dis){
    discount = dis;;
  }
}

//CartTester Class
public class CartTester{
  public static void main(String [] args){
    
    Cart c1 = new Cart ();
    Cart c2 = new Cart ();
    Cart c3 = new Cart ();
    
    c1.create_cart(1);
    c2.create_cart(2);
    c3.create_cart(3);
    
    System.out.println("====1====");
    c1.addItem("Table", 3900.5);
    c1.addItem("Chair", 1400.76);
    c1.addItem(5400.87, "Television");
    c1.addItem(5000.0, "Refrigerator");
    
    System.out.println("====2====");
    c2.addItem("Stove",439.90);
    
    System.out.println("====3====");
    c3.addItem("Chair",1400.5);
    c3.addItem(3400.0, "Chair");
    
    System.out.println("====4====");
    c1.cartDetails();
    
    System.out.println("====5====");
    c2.cartDetails();
    
    System.out.println("====6====");
    c3.cartDetails();
    c1.giveDiscount(10);
    
    System.out.println("====7====");
    c1.cartDetails();
  }
}
