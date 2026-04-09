//Player Class
public class Player{
  public String name;
  public int hp;
  public String [] defeated = new String [5];
  public int count = 0;
  
  public Player(String n, int h){
    this.name = n;
    this.hp = h;
    System.out.println(name + " joined the game");
    System.out.println("HP: " + hp);
  }
  
  public Player(String n){
    this.name = n;
    this.hp = 100;
    System.out.println(this.name + " joined the game");
    System.out.println("HP: " + this.hp);
  }
  
  public void viewInfo(){
    System.out.println("Player Name: " + this.name);
    System.out.println("Current HP: " + this.hp);
    
    if(count > 0){
      System.out.println("Defeated:");
      
      for(int i = 0; i < count; i++){
        if(i == 5){
          System.out.println(defeated[i] + ".");
        }else{
          System.out.print(defeated[i] + ", ");
        }
      }
      System.out.println();
    }
  }
  
  public void defeatVillain(Player obj){
    defeatVillain(obj.name, obj.hp);
  }
  
  public void defeatVillain(String n, int h){
    if(h > this.hp){
      System.out.println("failed to defeat " + n);
    }else if(h <= this.hp){
      defeated[count] = n;
      hp += h;
      System.out.println("defeated " + n);
      count++;
    }
  }
  
  public void defeatVillain(char p, String n, int h){
    int boost = p - '0';
    this.hp *= boost;
    System.out.println("HP with " + boost + "x boost: " + this.hp);
    defeatVillain(n, h);
  }
}

//PlayerTester Class
public class PlayerTester {
  public static void main(String[] args) {
    Player ben = new Player("Ben", 10);
    System.out.println("======1======");
    ben.viewInfo();
    System.out.println("======2======");
    ben.defeatVillain("Vilgax", 100);
    System.out.println("======3======");
    ben.defeatVillain("Yamcha", 10);
    System.out.println("======4======");
    ben.viewInfo();
    System.out.println("======5======");
    ben.defeatVillain('8', "Vilgax", 100);
    System.out.println("======6======");
    ben.viewInfo();
    System.out.println("======7======");
    Player kevin = new Player("Kevin");
    System.out.println("======8======");
    kevin.viewInfo();
    System.out.println("======9======");
    ben.defeatVillain(kevin);
    System.out.println("======10======");
    ben.viewInfo();
    System.out.println("======11======");
    Player goku = new Player("Goku", 9000);
    System.out.println("======12======");
    ben.defeatVillain(goku);
  }
}
