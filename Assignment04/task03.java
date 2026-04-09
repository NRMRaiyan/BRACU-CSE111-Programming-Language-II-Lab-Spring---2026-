//Student Class
public class Student{
  public String studentName;
  public int studentID;
  public String studentDept;
  public String email = null;
  
  private String password = null;
  private boolean loginStatus = false;
  
  public String [] course = new String[3];
  public int courseCount = 0;
  
  public Student(String name, int id, String dept){
    this.studentName = name;
    this.studentID = id;
    this.studentDept = dept;
    System.out.println("Student object is created");
  }
  
  public String getPassword(){
    return this.password;
  }
  
  public void setPassword(String pass){
    this.password = pass;
  }
  
  public boolean getLoginStatus(){
    return this.loginStatus;
  }
  
  public void setLoginStatus(boolean status){
    this.loginStatus = status;
  }
  
  public boolean isValid(){
    return (email != null && password != null);
  }
}

class Connect{
  public int totalAdvisee = 0;
  public Student [] advisee = new Student[5];
  
  public Connect(){
    System.out.println("Connect is ready to use!");
  }
  
  public void login(Student obj){
    if(!obj.isValid()){
      System.out.println("Email and password need to be set.");
    }else{
      obj.setLoginStatus(true);
      System.out.println("Login Successful!");
    }
  }
  
  public void advising(Student obj){
    if(!obj.getLoginStatus()){
      System.out.println("Please login to advise courses!");
    }else{
      System.out.println("You haven't selected any courses.");
    }
  }
  
  public void advising(Student obj, String c1, String c2, String c3, String c4){
    System.out.println("You need special approval to take more than 3 courses.");
  }
  
  public void advising(Student obj, String c1, String c2, String c3){
    if(!obj.getLoginStatus()){
      System.out.println("Please login to advise courses!");
      return;
    }
    
    obj.course[0] = c1;
    obj.course[1] = c2;
    obj.course[2] = c3;
    obj.courseCount = 3;
    
    boolean exists = false;
    for(int i = 0; i < totalAdvisee; i++){
      if(advisee[i] == obj){
        exists = true;
      }
    }
    
    if(!exists){
      advisee[totalAdvisee] = obj;
      totalAdvisee++;
    }
    
    System.out.println("Advising successful!");
  }
  
  public void allAdviseeInfo(){
    System.out.println("Total Advisee: " + totalAdvisee);
    
    for(int i = 0; i < totalAdvisee; i++){
      Student obj = advisee[i];
      System.out.print("Name: " + obj.studentName);
      System.out.println(" ID: " + obj.studentID);
      System.out.println("Department: " + obj.studentDept);
      
      for(int j = 0; j < obj.courseCount; j++){
        System.out.print(obj.course[j] + " ");
      }
      System.out.println();
      System.out.println("==============");
    }
  }
}

//ConnectTester Class
public class ConnectTester {
  public static void main(String[] args) {
    Student rakib = new Student("Rakib", 12301455, "CSE");
    Student roy = new Student("Roy", 12501345, "CS");
    System.out.println("1*************");
    Connect connectObj = new Connect();
    System.out.println("2*************");
    connectObj.login(rakib);
    System.out.println("3*************");
    connectObj.advising(rakib);
    System.out.println("4*************");
    rakib.email = "rakib@hotmail.com";
    rakib.setPassword("1234");
    System.out.println("5*************");
    connectObj.login(rakib);
    System.out.println("6*************");
    connectObj.advising(rakib);
    System.out.println("7*************");
    connectObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
    System.out.println("8*************");
    connectObj.advising(rakib, "CSE110", "PHY111","MAT110");
    System.out.println("9*************");
    connectObj.allAdviseeInfo();
    System.out.println("10*************");
    roy.email = "roy@hotmail.com";
    roy.setPassword("abcd");
    connectObj.login(roy);
    System.out.println("11*************");
    connectObj.advising(roy, "CSE110", "ENG101", "PHY112");
    System.out.println("12*************");
    connectObj.allAdviseeInfo();
  }
}
