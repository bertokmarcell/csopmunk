
package keveres;

import java.util.Scanner;

public class Prog {
    static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        KartyaPakli pakli = new KartyaPakli();
        pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            int tipp = melyik();;
            pakli.keveres(tipp);
        }
        pakli.ezVolt(); 
    }
 
    private static void kirak() {
        int szamlalo=0;
        for (int i = 1; i < 4; i++) {
            System.out.print("  "+i+"  ");
        }
        System.out.println("");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(KartyaPakli.pakli[szamlalo].getSzin()+KartyaPakli.pakli[szamlalo].getErtek()+"  |  ");
                szamlalo++;
            }
            System.out.println("");
        }
    }
    private static int melyik() {
        int tipp=0;
        while(tipp<1||tipp>3){
        System.out.println("tippelj egy szamot (1-3) : ");
        tipp = src.nextInt();
        }
        System.out.println("");
        return tipp;
        
        
    }
    
    
}
