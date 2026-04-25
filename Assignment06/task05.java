//StudentTester Class
public class StudentTester{
  public static void main (String args[]){
    CSEStudent.details();
    System.out.println("1--------------");
    CSEStudent s1 =  new CSEStudent("Bob", 23);
    s1.info();
    System.out.println("2--------------");
    CSEStudent s2 =  new CSEStudent("Don", 33);
    s2.info();
    System.out.println("3--------------");
    s1.addLabBasedCourse("CSE220");
    s1.addLabBasedCourse("CSE221");
    System.out.println("4--------------");
    s1.info();
    System.out.println("5--------------");
    CSEStudent.details();
    System.out.println("6--------------");
    s1.addLabBasedCourse("CSE230");
    System.out.println("7--------------");
    s1.info();
    System.out.println("8--------------");
    s2.addLabBasedCourse("CSE110");
    s2.info();
  }
}

//Student Parent Class
public class Student{
  public String name;
  public int id;
  public String courses = "";
  
  public Student(String n, int i){
    name = n;
    id = i;
  }
  
  public void info(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Courses: "+courses);
  }
}

//CSEStudent Child Class
public class CSEStudent extends Student{
  public static int count = 0;
  public static String[] labCourses = {"CSE110", "CSE111", "CSE220", "CSE221"};
  
  public CSEStudent(String name, int id){
    super(name, id);
    count++;
  }
  
  public void addLabBasedCourse(String course){
    boolean found = false;
    
    for(int i = 0; i < labCourses.length; i++){
      if(labCourses[i] == course){
        found = true;
      }
    }
    
    if(found){
      courses += course + " ";
    }else{
      System.out.println("It is not a lab based course!");
    }
  }
  
  public static void details(){
    System.out.println("Total CSE Students: " + count);
    System.out.println("Available Lab Based Courses: ");
    
    for(int i = 0; i < 4; i++){
      System.out.print(labCourses[i] + " ");
    }
    System.out.println();
  }
}
