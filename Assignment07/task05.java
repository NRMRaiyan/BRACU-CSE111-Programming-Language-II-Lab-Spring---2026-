//EmployeeTester Class
public class EmployeeTester {
 public static void main(String[] args) {
  Manager neymar = new Manager("Neymar",1000, 45, 10);
   Developer messi = new Developer("Messi", 1000, 50, "Java");
   Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
  neymar.calculateSalary();
  System.out.println("1.==========");
   neymar.displayInfo();
   System.out.println("2.==========");
   neymar.requestIncrement(100);
   System.out.println("3.==========");
   neymar.setHoursWorked(85);
   neymar.requestIncrement(100);
   System.out.println("4.==========");
   neymar.calculateSalary();
   System.out.println("5.==========");
   neymar.displayInfo();
   System.out.println("6.==========");
   messi.calculateSalary();
   System.out.println("7.==========");
   messi.displayInfo();
   System.out.println("8.==========");
   chiesa.calculateSalary();
   System.out.println("9.==========");
   chiesa.displayInfo();
 }
}

//Employee Parent Class
public class Employee{
    public String name;
    private double baseSalary;
    private int hoursWorked;

    public Employee(String name, double baseSalary, int hoursWorked){
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Work Hours: " + hoursWorked);
    }
}

//Manager Child Class
public class Manager extends Employee{
    public double bonus;
    public double finalSalary;
    
    public Manager(String name, double salary, int worked, double bonus){
        super(name, salary, worked);
        this.bonus = bonus;
    }

    public void calculateSalary(){
        if(getHoursWorked() > 40){
            finalSalary = getBaseSalary() + (getBaseSalary() * bonus / 100);
        }else{
            finalSalary = getBaseSalary();
        }
    }
    
    @Override
    public void displayInfo(){
      super.displayInfo();
      System.out.println("Bonus: " + this.bonus + " %");
      System.out.println("Final Salary: $" + this.finalSalary );
    }
    
    public void requestIncrement(int in){
      if(getHoursWorked() > 100){
        setBaseSalary(getBaseSalary() + in);
        System.out.println("$" + in + " Increment approved.");
      }else if(getHoursWorked() > 80 && getHoursWorked() <= 100){
        setBaseSalary(getBaseSalary() + (in / 2));
        System.out.println("$" + (in / 2) + " Increment approved.");
      }else{
        System.out.println("Increment denied.");
      }
    }
}

//Developer Child Class
public class Developer extends Employee{
  public double bonus;
  public double finalSalary;
  public String language;
    
    public Developer(String name, double salary, int worked, String language){
      super(name, salary, worked);
      this.bonus = bonus;
      this.language = language;
    }
    
    public void calculateSalary(){
      if(this.language.equals("Java")){
        this.finalSalary = getBaseSalary() + 700;
      }else{
        this.finalSalary = getBaseSalary();
      }
    }
    
    @Override
    public void displayInfo(){
      super.displayInfo();
      System.out.println("Language: " + this.language);
      System.out.println("Final Salary: $" + this.finalSalary);
    }
}
