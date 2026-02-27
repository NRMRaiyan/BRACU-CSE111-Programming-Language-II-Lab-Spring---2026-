//Imaginary Number class
public class ImaginaryNumber{
  
  public int realPart = 0;
  public int imaginaryPart = 0;
  
  public String printNumber(){
    return realPart + " + " + imaginaryPart + "i";
  }
}

//Tester 7 Class
import java.util.Scanner;
public class Tester7{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    ImaginaryNumber number1 = new ImaginaryNumber();
    
    String p = number1.printNumber();
    
    System.out.println(p);
    System.out.println("1********");
    
    //number1.realPart = 3;
    System.out.println("Enter number1 real part: ");
    int num1_realPart = sc.nextInt();
    number1.realPart = num1_realPart;
    
    //number1.imaginaryPart = 7;
    System.out.println("Enter number1 imaginary part: ");
    int num1_imaginaryPart = sc.nextInt();
    number1.imaginaryPart = num1_imaginaryPart;
    
    System.out.println(number1.printNumber());
    System.out.println("2********");
    
    
    ImaginaryNumber number2 = new ImaginaryNumber();
    
    //number2.realPart = 1;
    System.out.println("Enter number2 real part: ");
    int num2_realPart = sc.nextInt();
    number2.realPart = num2_realPart;
    
    //number2.imaginaryPart = 9;
    System.out.println("Enter number2 imaginary part: ");
    int num2_imaginaryPart = sc.nextInt();
    number2.imaginaryPart = num2_imaginaryPart;
    
    System.out.println(number2.printNumber());
  }
}
