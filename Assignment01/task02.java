import java.util.Scanner;

public class task02{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    String input_string = sc.nextLine();
    
    String new_string = "";
    
    for(int i = 0; i < input_string.length(); i++){
      
      char input_string_chars = input_string.charAt(i);
      
      if(input_string_chars == 'a'){
        new_string = new_string + 'z';
      }else{
        char previous_character = (char)(input_string_chars - 1);
        new_string = new_string + previous_character;
      }
    }
    
    System.out.println(new_string);
  }
}