import java.util.*;
public class CalculateGrowths{
    public String child;
    public int loop = 1;
    public CalculateGrowths(){
    Scanner s = new Scanner(System.in);
        do{
        System.out.println("Enter Child's Name\nor Stop to finish program: ");
        child = s.nextLine();
        child = child.toUpperCase();
        child = child.trim();
    if(child.equals("FORREST")){
        Growths.Forrest();
    }
    else if(child.equals("SIEGBERT")){
        Growths.Siegbert();
    }
    else if(child.equals("OPHELIA")){
        Growths.Ophelia();
    }
    else if(child.equals("NINA")){
        Growths.Nina();
    }
    else if(child.equals("PERCY")){
        Growths.Percy();
    }
    else if(child.equals("SOLEIL")){
        Growths.Soleil();
    }
    else if(child.equals("VELOURIA")){
        Growths.Velouria();
    }
    else if(child.equals("IGNATIUS")){
        Growths.Ignatius();
    }
    else if(child.equals("SHIRO")){
        Growths.Shiro();
    }
    else if(child.equals("KIRAGI")){
        Growths.Kiragi();
    }
    else if(child.equals("ASUGI")){
        Growths.notGaius();
    }
    else if(child.equals("CAELDORI")){
        Growths.notCordelia();
    }
    else if(child.equals("RHAJAT")){
        Growths.notTharja();
    }
    else if(child.equals("HISAME")){
        Growths.Hisame();
    }
    else if(child.equals("MITAMA")){
        Growths.Mitama();
    }
    else if(child.equals("SELKIE")){
        Growths.Selkie();
    }
    else if(child.equals("SOPHIE")){
        Growths.Sophie();
    }
    else if(child.equals("MIDORI")){
        Growths.Midori();
    }
    else if(child.equals("DWYER")){
        Growths.Dwyer();
    }
    else if(child.equals("STOP")){
        loop = 0;
    }
    else{
        System.out.println("Invalid child\nTry again");
    }
    }while(loop==1);
    }
}
