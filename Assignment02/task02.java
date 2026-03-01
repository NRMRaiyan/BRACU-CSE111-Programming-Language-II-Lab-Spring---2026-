//Assignment Class
public class Assignment{
  
  public int number_of_tasks;
  public String difficulty_level;
  public boolean submission_required = false;
  
  public void printDetails(){
    
    System.out.println("Number of tasks: " + number_of_tasks);
    System.out.println("Difficulty Level: " + difficulty_level);
    System.out.println("Submission required: " + submission_required);
    
  }
  
  public String makeOptional(){
    
    //submission_required = false;
    
    if(submission_required){
      submission_required = false;
      return "Assignment will not require submission";
    }else{
      return "Assignment is already not required";
    }
    
  }
}

//Assignment Tester Class
import java.util.Scanner;
public class AssignmentTester{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    Assignment asg1 = new Assignment();
    
    asg1.printDetails();
    
    System.out.println("1---------------");
    
    //asg1.number_of_tasks = 11;
    System.out.println("Enter number of tasks: ");
    int number_of_tasks1 = sc.nextInt();
    asg1.number_of_tasks = number_of_tasks1;
    
    sc.nextLine();
    
    //asg1.difficulty_level = "Moderate";
    System.out.println("Enter difficulty level: ");
    String difficulty_level1 = sc.nextLine();
    asg1.difficulty_level = difficulty_level1;
    
    //asg1.submission_required = true;
    System.out.println("Enter submission required: ");
    Boolean submission_required1 = sc.nextBoolean();
    asg1.submission_required = submission_required1;
    
    asg1.printDetails();
    
    
    System.out.println("2---------------");
    
    System.out.println(asg1.makeOptional());
    
    System.out.println("3---------------");
    
    asg1.printDetails();
    
    System.out.println("4---------------");
    
    Assignment asg2 = new Assignment();
    
    //asg2.number_of_tasks = 12;
    System.out.println("Enter number of tasks: ");
    int number_of_tasks2 = sc.nextInt();
    asg2.number_of_tasks = number_of_tasks2;
    
    sc.nextLine();
    
    //asg2.difficulty_level = "Hard";
    System.out.println("Enter difficulty level: ");
    String difficulty_level2 = sc.nextLine();
    asg2.difficulty_level = difficulty_level2;
    
    //asg2.submission_required = false;
    System.out.println("Enter submission required: ");
    Boolean submission_required2 = sc.nextBoolean();
    asg2.submission_required = submission_required2;
    
    asg2.printDetails();
    
    
    System.out.println("5---------------");
    
    System.out.println(asg2.makeOptional());
  }
}
