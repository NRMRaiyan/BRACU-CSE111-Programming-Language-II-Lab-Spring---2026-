//Event Class
public class Event {

    private String name;
    private String date;

    private static Event[] allEvents = new Event[5];
    private static int count = 0;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;

        if (count < 5) {
            allEvents[count] = this;
            count++;
        }
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String details() {
        return "Name: " + name + "\nDate: " + date;
    }

    public static void allEventInfo() {
        System.out.println("Total Events: " + count);
        System.out.println("Event Details: ");

        for (int i = 0; i < count; i++) {
            System.out.println("Event " + (i + 1) + ":");
            System.out.println("Name: " + allEvents[i].name);
            System.out.println("Date: " + allEvents[i].date);
        }
    }
}

//Organizer Class
public class Organizer {

    private String name;
    private Event[] events = new Event[4];
    private int count = 0;

    public Organizer() {
        System.out.println("Please provide the organizer's name");
    }

    public Organizer(String name) {
        this.name = name;
    }

    public void organizeEvent(Event e) {
        if (count < 4) {
            events[count] = e;
            count++;
            System.out.println(name + " successfully organized " + e.getName());
        }
    }

    public void searchEventByDate(String date) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (events[i].getDate().equals(date)) {
                System.out.println(events[i].getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No event is scheduled for " + date);
        }
    }
}

//EventTester Class
public class EventTester{
  public static void main(String args []){
    Event.allEventInfo();
    System.out.println("1--------------");
    Event ev1 = new Event("HP Day", "7/12/24");
    Event ev2 = new Event("TechConnect", "10/12/24"); 
    System.out.println(ev1.details());
    System.out.println("2--------------"); 
    Organizer uni = new Organizer();
    Organizer bracu = new Organizer("BRACU");
    Organizer buet = new Organizer("BUET");
    System.out.println("3--------------"); 
    Event.allEventInfo();
    System.out.println("4--------------"); 
    bracu.organizeEvent(ev1);
    bracu.organizeEvent(ev2); 
    System.out.println("5--------------"); 
    Event ev3 = new Event("From Earth to Orbit", "15/12/24"); 
    Event ev4 = new Event("NSysS 2024","21/12/24");
    System.out.println("6--------------"); 
    buet.organizeEvent(ev4);
    bracu.organizeEvent(ev3);
    System.out.println("7--------------"); 
    bracu.searchEventByDate("21/12/24");
    System.out.println("8--------------");
    bracu.searchEventByDate("15/12/24");
    System.out.println("9--------------");
    Event.allEventInfo();
  }
}
