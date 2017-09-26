import java.util.*;
public class Growths{
    static final int HP = 55;
    public static final int Atk = 15;
    public static final int Mag = 65;
    public static final int Skl = 20;
    public static final int Spd = 35;
    public static final int Lck = 25;
    public static final int Def = 25;
    public static final int Res = 55;
    public static String Mother;
    public Growths(){
        Scanner s = new Scanner(System.in);
        int loop = 1;
            
            do{
            System.out.println("Enter Forrest's Mother here: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim();    
            if(Mother.equals("AZURA")){
                System.out.println("\nGrowths Inherited from Azura");
                System.out.println((HP+InheritGrowths.Azura.HP)/2);
                System.out.println((Atk+InheritGrowths.Azura.Atk)/2);
                System.out.println((Mag+InheritGrowths.Azura.Mag)/2);
                System.out.println((Skl+InheritGrowths.Azura.Skl)/2);
                System.out.println((Spd+InheritGrowths.Azura.Spd)/2);
                System.out.println((Lck+InheritGrowths.Azura.Lck)/2);
                System.out.println((Def+InheritGrowths.Azura.Def)/2);
                System.out.println((Res+InheritGrowths.Azura.Res)/2);
            }
            else if(Mother.equals("FELICIA")){
                System.out.println("\nGrowths inherited from Felicia");
                System.out.println((HP+InheritGrowths.Felicia.HP)/2);
                System.out.println((Atk+InheritGrowths.Felicia.Atk)/2);
                System.out.println((Mag+InheritGrowths.Felicia.Mag)/2);
                System.out.println((Skl+InheritGrowths.Felicia.Skl)/2);
                System.out.println((Spd+InheritGrowths.Felicia.Spd)/2);
                System.out.println((Lck+InheritGrowths.Felicia.Lck)/2);
                System.out.println((Def+InheritGrowths.Felicia.Def)/2);
                System.out.println((Res+InheritGrowths.Felicia.Res)/2);
            }
            else if(Mother.equals("MOZU")){
                System.out.println("\nGrowths inherited from Mozu");
                System.out.println((HP+InheritGrowths.Moz.HP)/2);
                System.out.println((Atk+InheritGrowths.Moz.Atk)/2);
                System.out.println((Mag+InheritGrowths.Moz.Mag)/2);
                System.out.println((Skl+InheritGrowths.Moz.Skl)/2);
                System.out.println((Spd+InheritGrowths.Moz.Spd)/2);
                System.out.println((Lck+InheritGrowths.Moz.Lck)/2);
                System.out.println((Def+InheritGrowths.Moz.Def)/2);
                
            }
            else if(Mother.equals("EFFIE")){
                System.out.println("\nGrowths inherited from Effie");
                System.out.println((HP+InheritGrowths.Effie.HP)/2);
                System.out.println((Atk+InheritGrowths.Effie.Atk)/2);
                System.out.println((Mag+InheritGrowths.Effie.Mag)/2);
                System.out.println((Skl+InheritGrowths.Effie.Skl)/2);
                System.out.println((Spd+InheritGrowths.Effie.Spd)/2);
                System.out.println((Lck+InheritGrowths.Effie.Lck)/2);
                System.out.println((Def+InheritGrowths.Effie.Def)/2);
                System.out.println((Res+InheritGrowths.Effie.Res)/2);
            }
            else if(Mother.equals("NYX")){
                System.out.println("\nGrowths inherited from Nyx");
                System.out.println((HP+InheritGrowths.Nyx.HP)/2);
                System.out.println((Atk+InheritGrowths.Nyx.Atk)/2);
                System.out.println((Mag+InheritGrowths.Nyx.Mag)/2);
                System.out.println((Skl+InheritGrowths.Nyx.Skl)/2);
                System.out.println((Spd+InheritGrowths.Nyx.Spd)/2);
                System.out.println((Lck+InheritGrowths.Nyx.Lck)/2);
                System.out.println((Def+InheritGrowths.Nyx.Def)/2);
                System.out.println((Res+InheritGrowths.Nyx.Res)/2);
            }
            else{
                System.out.println("Invalid Mother\nPlease try again");
            }}while(loop==1);
    }
    
    public void parentgrowths(){
        
    }
}