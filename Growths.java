import java.util.*;
public class Growths{
    public static int HP;
    public static int Atk;
    public static int Mag;
    public static int Skl;
    public static int Spd;
    public static int Lck;
    public static int Def;
    public static int Res;
    public static int loop = 1;
    public static String Mother;
    public static Scanner s = new Scanner(System.in);
    
        public static void Forrest(){//Leo's child 
            HP = 55; Atk = 15; Mag = 65; Skl = 20; 
            Spd = 35; Lck = 25; Def = 25; Res = 55; 
            //Loops for user to choose mother from which inheritence comes from
            do{
            System.out.println("Enter Forrest's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim();     
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("SAKURA")){
                sakuraGrowths();
            }
            else if(Mother.equals("HINOKA")){
                hinokaGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
            }}while(loop==1);
    }
    
    public static void Siegbert(){//Xander's child
        loop = 1;
        HP = 40; Atk = 45; Mag = 5; Skl = 45;
        Spd = 45; Lck = 45; Def = 35; Res = 20;
        do{
            System.out.println("Enter Siegbert's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim(); 
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("SAKURA")){
                sakuraGrowths();
            }
            else if(Mother.equals("HINOKA")){
                hinokaGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
        }}while(loop==1);
    }
    
    public static void Ophelia(){//Odin's child
        loop = 1;
        HP = 45; Atk = 15; Mag = 45; Skl = 40;
        Spd = 45; Lck = 65; Def = 20; Res = 30;
        do{
            System.out.println("Enter Ophelia's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim(); 
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("ELISE")){
                eliseGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("CAMILLA")){
                camillaGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("OROCHI")){
                orochiGrowths();
            }
            else if(Mother.equals("KAGERO")){
                kageroGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
        }}while(loop==1);
    }
    
    public static void Nina(){//Niles' child
            HP = 30; Atk = 45; Mag = 30; Skl = 35; 
            Spd = 40; Lck = 50; Def = 25; Res = 45; 
            //Loops for user to choose mother from which inheritence comes from
            do{
            System.out.println("Enter Nina's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim();     
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("ELISE")){
                eliseGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("CAMILLA")){
                camillaGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("OBORO")){
                oboroGrowths();
            }
            else if(Mother.equals("SETSUNA")){
                setsunaGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
            }}while(loop==1);
    }
    
    public static void Percy(){//Arthur's child
        loop = 1;
        HP = 30; Atk = 30; Mag = 5; Skl = 45;
        Spd = 40; Lck = 75; Def = 55; Res = 15;
        do{
            System.out.println("Enter Siegbert's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim(); 
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("ELISE")){
                eliseGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("CAMILLA")){
                camillaGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("KAGERO")){
                kageroGrowths();
            }
            else if(Mother.equals("SETSUNA")){
                setsunaGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
        }}while(loop==1);
    }
    
    public static void Soleil(){//Laslow's child
        loop = 1;
        HP = 25; Atk = 60; Mag = 0; Skl = 35;
        Spd = 35; Lck = 45; Def = 35; Res = 40;
        do{
            System.out.println("Enter Ophelia's Mother here: \nOr enter stop to choose another child: ");
            Mother = s.nextLine();
            Mother = Mother.toUpperCase();
            System.out.println(Mother);
            Mother = Mother.trim(); 
            if(Mother.equals("AZURA")){
                azuraGrowths();
            }
            else if(Mother.equals("FELICIA")){
                feliciaGrowths();
            }
            else if(Mother.equals("MOZU")){
                mozuGrowths();
            }
            else if(Mother.equals("ELISE")){
                eliseGrowths();
            }
            else if(Mother.equals("EFFIE")){
                effieGrowths();
            }
            else if(Mother.equals("NYX")){
                nyxGrowths();
            }
            else if(Mother.equals("CAMILLA")){
                camillaGrowths();
            }
            else if(Mother.equals("SELENA")){
                selenaGrowths();
            }
            else if(Mother.equals("BERUKA")){
                berukaGrowths();
            }
            else if(Mother.equals("PERI")){
                periGrowths();
            }
            else if(Mother.equals("CHARLOTTE")){
                charlotteGrowths();
            }
            else if(Mother.equals("OROCHI")){
                orochiGrowths();
            }
            else if(Mother.equals("HANA")){
                hanaGrowths();
            }
            else if(Mother.equals("STOP")){
                loop = 0;
            }
            else{
            System.out.println("Invalid Mother\nPlease try again");
        }}while(loop==1);
    }
    
    public static void berukaGrowths(){
                System.out.println("\nGrowths inherited from Beruka");
                System.out.println((HP+InheritGrowths.Beruka.HP)/2);
                System.out.println((Atk+InheritGrowths.Beruka.Atk)/2);
                System.out.println((Mag+InheritGrowths.Beruka.Mag)/2);
                System.out.println((Skl+InheritGrowths.Beruka.Skl)/2);
                System.out.println((Spd+InheritGrowths.Beruka.Spd)/2);
                System.out.println((Lck+InheritGrowths.Beruka.Lck)/2);
                System.out.println((Def+InheritGrowths.Beruka.Def)/2);
                System.out.println((Res+InheritGrowths.Beruka.Res)/2);  
    }
    public static void azuraGrowths(){
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
    public static void feliciaGrowths(){
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
    public static void mozuGrowths(){
                System.out.println("\nGrowths inherited from Mozu");
                System.out.println((HP+InheritGrowths.Moz.HP)/2);
                System.out.println((Atk+InheritGrowths.Moz.Atk)/2);
                System.out.println((Mag+InheritGrowths.Moz.Mag)/2);
                System.out.println((Skl+InheritGrowths.Moz.Skl)/2);
                System.out.println((Spd+InheritGrowths.Moz.Spd)/2);
                System.out.println((Lck+InheritGrowths.Moz.Lck)/2);
                System.out.println((Def+InheritGrowths.Moz.Def)/2);
                System.out.println((Res+InheritGrowths.Moz.Res)/2);
    }
    public static void effieGrowths(){
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
    public static void nyxGrowths(){
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
    public static void selenaGrowths(){
                System.out.println("\nGrowths inherited from Selena");
                System.out.println((HP+InheritGrowths.Selena.HP)/2);
                System.out.println((Atk+InheritGrowths.Selena.Atk)/2);
                System.out.println((Mag+InheritGrowths.Selena.Mag)/2);
                System.out.println((Skl+InheritGrowths.Selena.Skl)/2);
                System.out.println((Spd+InheritGrowths.Selena.Spd)/2);
                System.out.println((Lck+InheritGrowths.Selena.Lck)/2);
                System.out.println((Def+InheritGrowths.Selena.Def)/2);
                System.out.println((Res+InheritGrowths.Selena.Res)/2);
    }
    public static void eliseGrowths(){
                System.out.println("\nGrowths inherited from Elise");
                System.out.println((HP+InheritGrowths.Elise.HP)/2);
                System.out.println((Atk+InheritGrowths.Elise.Atk)/2);
                System.out.println((Mag+InheritGrowths.Elise.Mag)/2);
                System.out.println((Skl+InheritGrowths.Elise.Skl)/2);
                System.out.println((Spd+InheritGrowths.Elise.Spd)/2);
                System.out.println((Lck+InheritGrowths.Elise.Lck)/2);
                System.out.println((Def+InheritGrowths.Elise.Def)/2);
                System.out.println((Res+InheritGrowths.Elise.Res)/2);
    }
    public static void camillaGrowths(){
                System.out.println("\nGrowths inherited from Camilla");
                System.out.println((HP+InheritGrowths.Camilla.HP)/2);
                System.out.println((Atk+InheritGrowths.Camilla.Atk)/2);
                System.out.println((Mag+InheritGrowths.Camilla.Mag)/2);
                System.out.println((Skl+InheritGrowths.Camilla.Skl)/2);
                System.out.println((Spd+InheritGrowths.Camilla.Spd)/2);
                System.out.println((Lck+InheritGrowths.Camilla.Lck)/2);
                System.out.println((Def+InheritGrowths.Camilla.Def)/2);
                System.out.println((Res+InheritGrowths.Camilla.Res)/2);
    }
    public static void periGrowths(){
                System.out.println("\nGrowths inherited from Peri");
                System.out.println((HP+InheritGrowths.Peri.HP)/2);
                System.out.println((Atk+InheritGrowths.Peri.Atk)/2);
                System.out.println((Mag+InheritGrowths.Peri.Mag)/2);
                System.out.println((Skl+InheritGrowths.Peri.Skl)/2);
                System.out.println((Spd+InheritGrowths.Peri.Spd)/2);
                System.out.println((Lck+InheritGrowths.Peri.Lck)/2);
                System.out.println((Def+InheritGrowths.Peri.Def)/2);
                System.out.println((Res+InheritGrowths.Peri.Res)/2);
    }
    public static void charlotteGrowths(){
                System.out.println("\nGrowths inherited from Charlotte");
                System.out.println((HP+InheritGrowths.Charlotte.HP)/2);
                System.out.println((Atk+InheritGrowths.Charlotte.Atk)/2);
                System.out.println((Mag+InheritGrowths.Charlotte.Mag)/2);
                System.out.println((Skl+InheritGrowths.Charlotte.Skl)/2);
                System.out.println((Spd+InheritGrowths.Charlotte.Spd)/2);
                System.out.println((Lck+InheritGrowths.Charlotte.Lck)/2);
                System.out.println((Def+InheritGrowths.Charlotte.Def)/2);
                System.out.println((Res+InheritGrowths.Charlotte.Res)/2);
    }
    public static void sakuraGrowths(){
                System.out.println("\nGrowths inherited from Sakura");
                System.out.println((HP+InheritGrowths.Sakura.HP)/2);
                System.out.println((Atk+InheritGrowths.Sakura.Atk)/2);
                System.out.println((Mag+InheritGrowths.Sakura.Mag)/2);
                System.out.println((Skl+InheritGrowths.Sakura.Skl)/2);
                System.out.println((Spd+InheritGrowths.Sakura.Spd)/2);
                System.out.println((Lck+InheritGrowths.Sakura.Lck)/2);
                System.out.println((Def+InheritGrowths.Sakura.Def)/2);
                System.out.println((Res+InheritGrowths.Sakura.Res)/2);
    }
    public static void hinokaGrowths(){
                System.out.println("\nGrowths inherited from Hinoka");
                System.out.println((HP+InheritGrowths.Hinoka.HP)/2);
                System.out.println((Atk+InheritGrowths.Hinoka.Atk)/2);
                System.out.println((Mag+InheritGrowths.Hinoka.Mag)/2);
                System.out.println((Skl+InheritGrowths.Hinoka.Skl)/2);
                System.out.println((Spd+InheritGrowths.Hinoka.Spd)/2);
                System.out.println((Lck+InheritGrowths.Hinoka.Lck)/2);
                System.out.println((Def+InheritGrowths.Hinoka.Def)/2);
                System.out.println((Res+InheritGrowths.Hinoka.Res)/2);
    }
    public static void orochiGrowths(){
                System.out.println("\nGrowths inherited from Orochi");
                System.out.println((HP+InheritGrowths.Orochi.HP)/2);
                System.out.println((Atk+InheritGrowths.Orochi.Atk)/2);
                System.out.println((Mag+InheritGrowths.Orochi.Mag)/2);
                System.out.println((Skl+InheritGrowths.Orochi.Skl)/2);
                System.out.println((Spd+InheritGrowths.Orochi.Spd)/2);
                System.out.println((Lck+InheritGrowths.Orochi.Lck)/2);
                System.out.println((Def+InheritGrowths.Orochi.Def)/2);
                System.out.println((Res+InheritGrowths.Orochi.Res)/2);
    }
    public static void kageroGrowths(){
                System.out.println("\nGrowths inherited from Kagero");
                System.out.println((HP+InheritGrowths.Kagero.HP)/2);
                System.out.println((Atk+InheritGrowths.Kagero.Atk)/2);
                System.out.println((Mag+InheritGrowths.Kagero.Mag)/2);
                System.out.println((Skl+InheritGrowths.Kagero.Skl)/2);
                System.out.println((Spd+InheritGrowths.Kagero.Spd)/2);
                System.out.println((Lck+InheritGrowths.Kagero.Lck)/2);
                System.out.println((Def+InheritGrowths.Kagero.Def)/2);
                System.out.println((Res+InheritGrowths.Kagero.Res)/2);
    }
    public static void oboroGrowths(){
                System.out.println("\nGrowths inherited from Hinoka");
                System.out.println((HP+InheritGrowths.Oboro.HP)/2);
                System.out.println((Atk+InheritGrowths.Oboro.Atk)/2);
                System.out.println((Mag+InheritGrowths.Oboro.Mag)/2);
                System.out.println((Skl+InheritGrowths.Oboro.Skl)/2);
                System.out.println((Spd+InheritGrowths.Oboro.Spd)/2);
                System.out.println((Lck+InheritGrowths.Oboro.Lck)/2);
                System.out.println((Def+InheritGrowths.Oboro.Def)/2);
                System.out.println((Res+InheritGrowths.Oboro.Res)/2);
    }
    public static void setsunaGrowths(){
                System.out.println("\nGrowths inherited from Setsuna");
                System.out.println((HP+InheritGrowths.Setsuna.HP)/2);
                System.out.println((Atk+InheritGrowths.Setsuna.Atk)/2);
                System.out.println((Mag+InheritGrowths.Setsuna.Mag)/2);
                System.out.println((Skl+InheritGrowths.Setsuna.Skl)/2);
                System.out.println((Spd+InheritGrowths.Setsuna.Spd)/2);
                System.out.println((Lck+InheritGrowths.Setsuna.Lck)/2);
                System.out.println((Def+InheritGrowths.Setsuna.Def)/2);
                System.out.println((Res+InheritGrowths.Setsuna.Res)/2);
    }
    public static void hanaGrowths(){
                System.out.println("\nGrowths inherited from Hana");
                System.out.println((HP+InheritGrowths.Hana.HP)/2);
                System.out.println((Atk+InheritGrowths.Hana.Atk)/2);
                System.out.println((Mag+InheritGrowths.Hana.Mag)/2);
                System.out.println((Skl+InheritGrowths.Hana.Skl)/2);
                System.out.println((Spd+InheritGrowths.Hana.Spd)/2);
                System.out.println((Lck+InheritGrowths.Hana.Lck)/2);
                System.out.println((Def+InheritGrowths.Hana.Def)/2);
                System.out.println((Res+InheritGrowths.Hana.Res)/2);
    }
}
