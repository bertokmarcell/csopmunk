package Test;

import keveres.KartyaPakli;
import keveres.Lap;

public class Testek {
    static KartyaPakli pakli = new KartyaPakli();
    public static void main(String[] args) {
        
    }
    public static void testkeveres1lefut(){
    KartyaPakli pakli = new KartyaPakli();
    pakli.keveres(1);
    assert KartyaPakli.getPakli() != null;
    }
    public static void testnemlehetNull() {
    KartyaPakli pakli = new KartyaPakli();
    pakli.keveres(1);
    Lap[] lapok = KartyaPakli.getPakli();
    for (Lap lap : lapok) {
    assert lap != null;
    }  
    }
    public static void testkeveres1cseretest(){
    
        
    }
}
