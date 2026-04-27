//This was an ungraded task (optional)

//PlayerTester Class
public class PlayerTester {
    public static void main(String[] args) {
        Player playerOne = new Player("Al-Nassr", "Ronaldo", "Striker", 25, 32);
        playerOne.calculateRatio();
        playerOne.printDetails();
        System.out.println("----------------");
        Manager managerOne = new Manager("Real Madrid", "Zidane", "Manager", 25);
        managerOne.printDetails();
  }
}

//SportsPerson Parent Class
public class SportsPerson {
    private String team;
    private String name;
    public String role;
    public double earningPerMatch;
  
    public SportsPerson(String teamName, String name, String role){
        this.team = teamName;
        this.name = name;
        this.role = role;
        this.earningPerMatch = 0;
    }
  
    public String getNameTeam() {
        return "Name: " + name + ", Team Name: " + team;
    }
}

//Player Child Class
public class Player extends SportsPerson{
    public int totalGoal;
    public int totalPlayed;
    public double goalRatio;
    public double matchEarning;

    public Player(String team, String name, String role, int goal, int played){
        super(team, name, role);
        totalGoal = goal;
        totalPlayed = played;
        earningPerMatch = (totalGoal * 1000) + (totalPlayed * 10);
    }

    public void calculateRatio(){
        goalRatio = (double) (totalGoal / totalPlayed);
    }

    public void printDetails(){
        System.out.println(this.getNameTeam());
        System.out.println("Total Goal: " + totalGoal + ", Total Played: " + totalPlayed);
        System.out.println("Goal Ratio: " + goalRatio);
        System.out.println(earningPerMatch);
    }
}

//Manager Child Class
public class Manager extends SportsPerson{
    public int totalWin;

    public Manager(String team, String name, String role, int win){
        super(team, name, role);
        totalWin = win;
        earningPerMatch = (totalWin * 1000);
    }

    public void printDetails(){
        System.out.println(super.getNameTeam());
        System.out.println("Total Win: " + totalWin);
        System.out.println("Match Earning: " + earningPerMatch);
    }
}
