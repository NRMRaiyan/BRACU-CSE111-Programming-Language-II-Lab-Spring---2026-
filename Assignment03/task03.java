//Reader Class
public class Reader{
  
  public String readerName = "New user";
  public int readerCapacity = 2;
  public String [] bookName = new String[readerCapacity];
  public int count = 0;
  
  public Reader(String name){
    readerName = name;
    System.out.println("A new reader is created!");
  }
  
  public Reader(String name, int capacity){
    readerName = name;
    readerCapacity = capacity;
    bookName = new String[readerCapacity];
    System.out.println("A new reader is created!");
  }
  
  public void readerInfo(){
    System.out.println("Name: " + readerName);
    System.out.println("Capacity: " + readerCapacity);
    
    System.out.println("Books:");
    
    for(int i = 0; i < readerCapacity; i++){
      if(bookName[i] == null){
        System.out.println("No books added yet");
        return;
      }else{
        System.out.println("Book " + (i + 1) + ": " + bookName[i]);
      }
    }
  }
  
  public void addBook(String name){
    if(count == readerCapacity){
      System.out.println("No more capacity");
    }else{
      bookName[count] = name;
      count++;
    }
  }
  
  public void updateCapacity(int capacity){
    readerCapacity = capacity;
    
    String [] newBooks = new String[readerCapacity];
    
    for(int i = 0; i < count; i++){
      newBooks[i] = bookName[i];
    }
    
    bookName = newBooks;
    
    System.out.println("Capacity has changed to " + readerCapacity);
  }
}

//Reader_tester Class
public class Reader_tester{
  public static void main(String [] args){
    
    System.out.println("1 ==========");
    Reader r1 = new Reader("Messi");
    Reader r2 = new Reader("Ronaldo", 3);
    System.out.println("2 ==========");
    r1.readerInfo();
    System.out.println("3 ==========");
    r2.addBook("Java");
    r2.addBook("Python");
    r2.addBook("C++");
    r2.readerInfo();
    System.out.println("4 ==========");
    r1.addBook("C#");
    r1.addBook("Rust");
    r1.addBook("GoLang");
    System.out.println("5 ==========");
    r2.addBook("Python");
    System.out.println("6 ==========");
    r1.readerInfo();
    System.out.println("7 ==========");
    r1.updateCapacity(3);
    System.out.println("8 ==========");
    r1.addBook("GoLang");
    System.out.println("9 ==========");
    r1.readerInfo();

  }
}
