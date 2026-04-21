//Artifact Class
public class Artifact {

    private String name;
    private String owner;

    private static Artifact[] vault = new Artifact[4];
    private static int count = 0;

    public Artifact(String name, String owner){
        this.name = name;
        this.owner = owner;
    }

    public Artifact(String name){
        this.name = name;
        this.owner = "Okabe";
    }

    public String GetName(){
        return name;
    }

    public static void AddtoVault(Artifact a){
        if(count >= 4){
            System.out.println("!!" + a.owner + " unsuccessful in adding artifact to the vault!!");
        } else {
            vault[count] = a;
            count++;
            System.out.println(a.owner + " added " + a.name + " successfully to the vault.");
        }
    }

    public int CalcPower(){
        int sum = 0;

        if(name.length() % 2 == 0){
            for(int i = 0; i < name.length(); i += 2){
                sum += (int) name.charAt(i);
            }
        } else {
            for(int i = 1; i < name.length(); i += 2){
                sum += (int) name.charAt(i);
            }
        }

        return sum;
    }

    public static void labReport(){
        System.out.println("=== Future Gadget Lab ===");

        for(int i = 0; i < count; i++){
            System.out.println(
                vault[i].name + " added by " + vault[i].owner +
                " has power of " + vault[i].CalcPower() + "."
            );
        }
    }

    public static String strongest(){
        int max = -1;
        String strongestName = "";

        for(int i = 0; i < count; i++){
            int power = vault[i].CalcPower();
            if(power > max){
                max = power;
                strongestName = vault[i].name;
            }
        }

        return strongestName;
    }

    public void revealArtifact(){
        System.out.println(
            name + " added by " + owner +
            " has power of " + CalcPower() + "."
        );
    }

    public void changeName(String newName){
        this.name = newName;
        System.out.println("Name changed and power recalculated.");
    }
}

//TesterArtifact Class
public class TesterArtifact{
  public static void main(String[] args) {
    Artifact a = new Artifact("Phone Microwave", "Kurisu");
    System.out.println("--------1-------");
    Artifact.AddtoVault(a);
    Artifact.AddtoVault(new Artifact("D-Mail Capsule", "Mayuri"));
    System.out.println("--------2-------");
    Artifact c = new Artifact("C204 Chip");
    Artifact d = new Artifact("Divergence Meter"); 
    Artifact e = new Artifact("M4A2 Robot", "Okabe");
    Artifact.AddtoVault(c);
    Artifact.AddtoVault(d);
    Artifact.AddtoVault(e);
    System.out.println("--------3-------");
    Artifact.labReport();
    System.out.println("--------4-------");
    System.out.println("Power of "+c.GetName()+" is "+c.CalcPower());
    System.out.println("--------5-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
    System.out.println("--------6-------");
    a.revealArtifact();
    System.out.println("--------7-------");
    a.changeName("Banana Microwave");
    System.out.println("--------8-------");
    Artifact.labReport();
    System.out.println("--------9-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
  }
}
