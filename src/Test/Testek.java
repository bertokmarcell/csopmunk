package Test;

import keveres.KartyaPakli;
import keveres.Lap;

public class Testek {
    static KartyaPakli pakli = new KartyaPakli();
    public static void main(String[] args) {
        testPakliMerete();
        testPaklibanNincsNull();
        testPakliMereteNemValtozikKeveresUtan();
        testPaklibanNincsDuplikatumKEveresUtan();
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
    
    private static void testPakliMerete() {
        System.out.print("Pakli mérete teszt: ");
        int vart = 21;
        int kapott = KartyaPakli.getPakli().length;
        assert vart == kapott : "A pakli mérete nem 21!";
        System.out.println("Megfelelt");
    }
    
    private static void testPaklibanNincsNull() {
        System.out.print("Pakliban nincs null teszt: ");
        Lap[] pakli = KartyaPakli.getPakli();
        boolean nincsNull = true;
        for (Lap lap : pakli) {
            if (lap == null) {
                nincsNull = false;
            }
        }
        assert nincsNull : "Null érték van a pakliban!";
        System.out.println("Megfelelt");
    }
    
    private static void testPakliMereteNemValtozikKeveresUtan() {
        System.out.print("Pakli mérete keverés után teszt: ");
        pakli.keveres(1);
        int vart = 21;
        int kapott = KartyaPakli.getPakli().length;
        assert vart == kapott : "Keverés után megváltozott a pakli mérete!";
        System.out.println("Megfelelt");
    }
    
    private static void testPaklibanNincsDuplikatumKEveresUtan() {
        System.out.print("Pakliban nincs duplikátum keverés után teszt: ");
        pakli.keveres(1);
        Lap[] pakli = KartyaPakli.getPakli();
        boolean nincsDuplikatum = true;
        for (int i = 0; i < pakli.length; i++) {
            for (int j = i + 1; j < pakli.length; j++) {
                if (pakli[i] != null && pakli[j] != null &&
                    pakli[i].getErtek().equals(pakli[j].getErtek()) &&
                    pakli[i].getSzin().equals(pakli[j].getSzin())) {
                    nincsDuplikatum = false;
                }
            }
        }
        assert nincsDuplikatum : "Keverés után duplikált lap van a pakliban!";
        System.out.println("Megfelelt");
    }
}
