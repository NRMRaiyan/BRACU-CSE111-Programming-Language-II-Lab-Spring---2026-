//StudentTester Class
public class StudentTester{
  public static void printShout(Student s){
    System.out.println("------------------");
    System.out.println(s.msg);
    System.out.println(s.shout());
  }
  public static void main(String [] args){
    Student s = new Student();
    CSEStudent cs = new CSEStudent();
    CSE111Student cs111 = new CSE111Student();
    System.out.println(s.msg);
    System.out.println(cs.msg);
    System.out.println(cs111.msg);
    printShout(s);
    printShout(cs);
    printShout(cs111);
  }
}

//Student Parent Class
public class Student{
  public String msg = "I love BU";
  public String shout(){
    return msg;
  }
}

//CSEStudent Child Class
public class CSEStudent extends Student{
  public String msg = "I want to transfer to CSE";
  
  @Override
  public String shout(){
    return msg;
  }
}

//CSE111Student Child Class
public class CSE111Student extends Student{
  public String msg = "I love Java Programming";
  
  @Override
  public String shout(){
    return msg;
  }
}
