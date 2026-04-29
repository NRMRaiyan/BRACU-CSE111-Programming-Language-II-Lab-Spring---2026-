//ConcertTerster Class
public class ConcertTester {
    public static void main(String[] args) {    
    Concert concert = new Concert("ABC Conference Center","7:00 PM");   
    concert.showDetails();
    System.out.println("--------1--------");   
    concert.addArtist("Tahsan Khan");
    concert.addArtist("Habib Wahid");   
    concert.showDetails();
    System.out.println("--------2--------");   
    Audience a1 = new Audience("Sarah");
    Audience a2 = new Audience("Alex");
    System.out.println("--------3--------");
    a1.buyConcertTicket(concert, "A", 3);    
    a2.buyConcertTicket(concert, "B");  
    System.out.println("--------4--------");
    concert.showDetails();
    System.out.println("--------5--------");
    VIPConcert vipConcert = new VIPConcert("Army Stadium","10:00 PM");
    vipConcert.addArtist("Atif Aslam");    
    Audience a3 = new Audience("Emily");
    a3.buyConcertTicket(vipConcert); 
    System.out.println("--------6--------");
    vipConcert.showDetails();
    System.out.println("--------7--------");;
    Concert.showTotalTicketsSold();
  }
}

//Audience Class
public class Audience {
  private String name;
  public Audience(String name) {
    this.name = name;
  }
  public void buyConcertTicket(Concert concert, String zone, int quantity) {
    System.out.println(name + " bought " + quantity + " ticket(s) in Zone " + zone);
    concert.buyTicket(zone, quantity);
  } 
  public void buyConcertTicket(Concert concert, String zone) {
    System.out.println(name + " bought 1 ticket(s) in Zone " + zone);
    concert.buyTicket(zone);
  }
  public void buyConcertTicket(VIPConcert concert) {
    System.out.println(name + " bought 1 ticket(s) in Zone VIP");
    concert.buyTicket();   
  }
}

//Concert Parent Class
public class Concert{
    public String name;
    public String showTime;
    public int ticketSold = 0;
    public static int totalTicketSold = 0;
    public String [] artists = new String[5];
    public int artistCount = 0;

    public Concert(String name, String time){
        this.name = name;
        this.showTime = time;
    }

    public void addArtist(String name){
        artists[artistCount] = name;
        artistCount++;
    }

    public void buyTicket(){
        System.out.println("Total price: " + 2000);
        ticketSold++;
        totalTicketSold++;
    }

    public void buyTicket(String zone){
        if(zone.equals("A")){
            System.out.println("Total price: " + 500);
        }else if(zone.equals("B")){
            System.out.println("Total price: " + 1000);
        }else if(zone.equals("VIP")){
            System.out.println("Total price: " + 2000);
        }
        ticketSold++;
        totalTicketSold++;
    }

    public void buyTicket(String zone, int quantity){
        if(zone.equals("A")){
            System.out.println("Total price: " + (quantity * 500));
        }else if(zone.equals("B")){
            System.out.println("Total price: " + (quantity * 1000));
        }else if(zone.equals("VIP")){
            System.out.println("Total price: " + (quantity * 2000));
        }
        ticketSold += quantity;
        totalTicketSold += quantity;
    }

    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): " + totalTicketSold);
    }

    public void showDetails(){
        System.out.println("Venue: " + this.name);
        System.out.println("Showtime: " + this.showTime);
        System.out.println("Artists:");

        for(int i = 0; i < artistCount; i++){
            System.out.println("-" + artists[i]);
        }
        System.out.println("Tickets sold in this concert: " + ticketSold);
    }

}

//VIPConcert Child Class
public class VIPConcert extends Concert{
    
    public VIPConcert(String name, String time){
        super(name, time);
    }
}
