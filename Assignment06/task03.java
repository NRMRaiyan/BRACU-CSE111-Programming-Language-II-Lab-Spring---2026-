//Tester6 Class
public class Tester6 {
  public static void main(String[] args) {
    Book book = new Book(1, "The Alchemist", 500, "97806", "HarperCollins");
    System.out.println(book.printDetail());
    System.out.println("-----------------------");
    
    CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
    System.out.println(cd.printDetail());
  }
}

//Product Parent Class
public class Product {
  private int id;
  private String title;
  private int price;
  
  public Product(int id, String title, int price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }
  
  public String getIdTitlePrice() {
    return "ID: " + id + " Title: " + title + " Price: " + price;
  }
}

//Book Child Class
public class Book extends Product{
  private String isbn;
  private String publisher;
  
  public Book(int id, String title, int price, String isbn, String publisher){
    super(id, title, price);
    this.isbn = isbn;
    this.publisher = publisher;
  }
  
  public String printDetail(){
    return super.getIdTitlePrice() + " ISBN: " + isbn + " Publisher: " + publisher;
  }
  
}

//CD Child Class
public class CD extends Product{
  private String band;
  private int duration;
  private String genre;
  
  public CD(int id, String title, int price, String band, int duration, String genre){
    super(id, title, price);
    this.band = band;
    this.duration = duration;
    this.genre = genre;
  }
  
  public String printDetail(){
    return super.getIdTitlePrice() + " Band: " + band + " Duration: " + duration + " minutes Genre: " + genre;
  }
}
