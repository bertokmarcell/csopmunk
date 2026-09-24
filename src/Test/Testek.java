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
    public static void testnemlehetNullkeverekor() {
    KartyaPakli pakli = new KartyaPakli();
    pakli.keveres(1);
    Lap[] lapok=KartyaPakli.getPakli();
    for (Lap lap:lapok) {
    assert lap!=null;
    }  
    }
    public static void testkeveres1cseretest(){
    KartyaPakli pakli = new KartyaPakli();
    Lap[] testpack = KartyaPakli.getPakli();
    String test1 = testpack[0].getErtek();
    String test2 = testpack[0].getSzin();
    pakli.keveres(1);
    assert testpack[20].getErtek().equals(test1);
    assert testpack[20].getSzin().equals(test2);
    }
    public static void testKeveresLapMegmaradas() {
    KartyaPakli pakli = new KartyaPakli();
    Lap[] lapok = KartyaPakli.getPakli();
    String szin = lapok[0].getSzin();
    String ertek = lapok[0].getErtek();
    pakli.keveres(1);
    boolean megtalalta = false;
    for (Lap lap : lapok) {
        if (lap.getSzin().equals(szin) &&
            lap.getErtek().equals(ertek)) {
            megtalalta = true;
        }
    }
    assert megtalalta;
}
}
