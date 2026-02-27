//Design Class
public class CSECourse{
  public String courseName;
  public String courseCode;
  public int credit;
}

//Driver Code
import java.util.Scanner;

public class CourseTester{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    CSECourse c1 = new CSECourse();
    
    c1.courseName = sc.nextLine();
    c1.courseCode = sc.nextLine();
    c1.credit = sc.nextInt();

    
    System.out.println("Course Name: " + c1.courseName);
    System.out.println("Course Code: " + c1.courseCode);
    System.out.println("Credit: " + c1.credit);
    
  }
}
