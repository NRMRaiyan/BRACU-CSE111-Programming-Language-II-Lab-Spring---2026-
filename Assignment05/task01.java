//Product Class
public class Product{
  
  public String product;
  public int quantity;
  
  static Product [] productsArray = new Product [3];
  public static int count = 0;
  
  public Product(String prod, int qnt){
    
    if(count < 3){
      this.product = prod;
      this.quantity = qnt;
      
      productsArray[count] = this;
      
      System.out.println("Stored: " + productsArray[count].product);
      count++;
    }else{
      System.out.println("Storage is full! Cannot add " + prod);
    }
  }
  
  public static void displayProducts(){
    System.out.println("=== Stored Products ===");
    for(int i = 0; i < count; i++){
      System.out.println(productsArray[i].product + " - Qty: " + productsArray[i].quantity);
    }
  }
  
  public static void buy(String prod, int qnt){
    boolean found = false;
    
    for(int i = 0; i < count; i++){
      if(productsArray[i].product == prod){
        found = true;
        
        if(productsArray[i].quantity < qnt){
          System.out.println("Quantity low");
        }else{
          productsArray[i].quantity -= qnt;
          System.out.println("Product Sold");
        }
        break;
      }
    }
    if(!found){
      System.out.println("Product not found");
    }
  }
}

//ProductTester Class
public class ProductTester{
  public static void main(String[] args) {
    Product p1 = new Product("Table", 10); 
    Product p2 = new Product("Chair", 15);
    Product p3 = new Product("Sofa", 20);
    Product p4 = new Product("Divan", 8);
    System.out.println("------------1------------");
    Product.displayProducts();
    System.out.println("------------2------------");
    Product.buy("Chair", 5);
    System.out.println("------------3------------");
    Product.displayProducts();
    System.out.println("------------4------------");
    Product.buy("Sofa", 25);
    System.out.println("------------5------------");
    Product.displayProducts();
    System.out.println("------------6------------");
    Product.buy("Bed", 10);
  }
}
