//Animalkeepers Class
public class Animalkeepers {

    public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    private static String[] tasks = new String[5];
    private static String[] keepers = new String[5];

    private static int totalKeepers = 0;
    private static int totalTasks = 0;
    private static int idCounter = 101;

    private String name;
    private int id;

    public Animalkeepers(String name) {
        this.name = name;
        this.id = idCounter++;
        totalKeepers++;

        System.out.println(name + " with ID " + id + " got the job!");
    }

    public void doTask(String animal, String task) {
        int index = -1;

        for (int i = 0; i < Animals.length; i++) {
            if (Animals[i].equals(animal)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Animal not in the Safari");
            return;
        }

        if (tasks[index] == null) {
            totalTasks++;
        }

        tasks[index] = task;
        keepers[index] = this.name;

        System.out.println("Task assigned to " + this.name);
    }

    public static void printTasks() {
        if (totalTasks == 0) {
            System.out.println("No tasks assigned.");
            return;
        }

        for (int i = 0; i < Animals.length; i++) {
            if (tasks[i] != null) {
                System.out.println(tasks[i] + " (Keeper - " + keepers[i] + ") === " + Animals[i]);
            }
        }
    }

    public static void details() {
        if (totalKeepers == 0) {
            System.out.println("No Animal Keepers working yet.");
        } else {
            System.out.println("Total Animal Keeper: " + totalKeepers);
            System.out.println("Total Task assigned: " + totalTasks);
            printTasks();
        }
    }
}

//KeeperTester Class
import java.util.Arrays;
public class KeeperTester {
  public static void main(String[] args) {
    Animalkeepers.details();
    System.out.println("---------1----------");
    System.out.println(Arrays.toString(Animalkeepers.Animals));
    System.out.println("---------2----------");
    Animalkeepers leo = new Animalkeepers("Leo");
    Animalkeepers theo = new Animalkeepers("Theo");
    Animalkeepers mochi = new Animalkeepers("Mochi");
    System.out.println("---------3----------");
    Animalkeepers.printTasks();
    System.out.println("---------4----------");
    leo.doTask("Lion", "Feed");
    System.out.println("---------5----------");
    leo.doTask("Monkey", "Feed");
    System.out.println("---------6----------");
    Animalkeepers.details();
    System.out.println("---------7----------");
    theo.doTask("Tiger", "Bathe");
    mochi.doTask("Seal", "Clean Pen");
    mochi.doTask("Deer", "Add Food");
    System.out.println("---------8----------");
    Animalkeepers.printTasks();
    System.out.println("---------9----------");
    leo.doTask("Deer", "Play");
    System.out.println("---------10----------");
    Animalkeepers.details();
  }
}
