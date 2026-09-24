
package keveres;

import java.util.Scanner;

public class Prog {
    static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        kirak();
        melyik();
    }

    private static void kirak() {
        int szamlalo=0;
        for (int i = 1; i < 4; i++) {
            System.out.print("  "+1+"  ");
        }
        System.out.println("");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(KartyaPakli.pakli[szamlalo]+"  |  ");
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
