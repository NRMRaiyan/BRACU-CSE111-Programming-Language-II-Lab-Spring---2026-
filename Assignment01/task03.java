import java.util.Scanner;

public class task03{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter size of the array: ");
    int arraySize = sc.nextInt();
    
    int [] newArray = new int[arraySize];
    int [] countingArray = new int[arraySize];
    
    for(int i = 0; i < arraySize; i++){
      newArray[i] = sc.nextInt();
    }
    
    for(int i = 0; i < arraySize; i++){
      
      if(countingArray[i] == 1){
        continue;
      }
      
      int count = 1;
      
      for(int j = i + 1; j < arraySize; j++){
        
        if(newArray[i] == newArray[j]){
          count++;
          countingArray[j] = 1;
        }
      }
      
      System.out.println(newArray[i] + " - " + count + " times");
    }
  }
}