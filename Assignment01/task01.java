import java.util.Scanner;
public class task01{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number 1: ");
    int number_1 = sc.nextInt();
    System.out.println("Enter number 2: ");
    int number_2 = sc.nextInt();
    
    int count = 0;
    
    int first, second;
    
    if(number_1 < number_2){
      first = number_1;
      second = number_2;
    }else{
      first = number_2;
      second = number_1;
    }
    
    for(int i = first + 1; i < second; i++){
      if(i > 1){
        int flag = 1;
        
        for(int j = 2; j * j <= i;j++){
          if(i % j == 0){
            flag = 0;
            break;
          }
        }
        if(flag == 1){
          count++;
        }
      }
    }
    System.out.println("There are " + count + " prime numbers between " + number_1 + " and " + number_2 + ".");
  }
}
