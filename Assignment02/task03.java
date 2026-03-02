//Employee Class
public class Employee{
  
  public String name;
  public double salary;
  public String designation;
  public double tax;
  
  public void newEmployee(String new_employee){
    name = new_employee;
    salary = 30000.0;
    designation = "junior";
  }
  
  public void displayInfo(){
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + designation);
  }
  
  public void calculateTax(){
    if(salary > 50000.0){
      tax = salary * 0.30;
      System.out.println(name + " Tax Amount: " + tax);
    }else if(salary > 30000.0){
      tax = salary * 0.10;
      System.out.println(name + " Tax Amount: " + tax);
    }else{
      System.out.println("No need to pay tax");
    }
  }
  
  public void promoteEmployee(String promotedDesignation){
    
    if(promotedDesignation == "senior"){
      designation = promotedDesignation;
      salary = salary + 25000.0;
    }else if(promotedDesignation == "lead"){
      designation = promotedDesignation;
      salary = salary + 50000.0;
    }else if(promotedDesignation == "manager"){
      designation = promotedDesignation;
      salary = salary + 75000.0;
    }
    
    System.out.println(name + " has been promoted to " + promotedDesignation);
    System.out.println("New Salary: " + salary + " Tk");
  }
}

//Tester9 Class
import java.util.Scanner;
public class Tester9{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
    
    //emp1.newEmployee("Harry Potter");
    System.out.println("Enter employee 1 name: ");
    String employee1 = sc.nextLine();
    emp1.newEmployee(employee1);
    
    //emp2.newEmployee("Hermione Granger");
    System.out.println("Enter employee 2 name: ");
    String employee2 = sc.nextLine();
    emp2.newEmployee(employee2);
    
    //emp3.newEmployee("Ron Weasley");
    System.out.println("Enter employee 3 name: ");
    String employee3 = sc.nextLine();
    emp3.newEmployee(employee3);
    
    System.out.println("1 ==========");
    
    emp1.displayInfo();
    
    System.out.println("2 ==========");
    
    emp2.displayInfo();
    
    System.out.println("3 ==========");
    
    emp3.displayInfo();
    
    System.out.println("4 ==========");
    
    emp1.calculateTax();
    
    System.out.println("5 ==========");
    
    emp1.promoteEmployee("lead");
    
    System.out.println("6 ==========");
    
    emp1.calculateTax();
    
    System.out.println("7 ==========");
    
    emp1.displayInfo();
    
    System.out.println("8 ==========");
    
    emp3.promoteEmployee("manager");
    
    System.out.println("9 ==========");
    
    emp3.calculateTax();
    
    System.out.println("10 ==========");
    
    emp3.displayInfo();
  }
}
