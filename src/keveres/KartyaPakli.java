package keveres;
    
public class KartyaPakli {

    static Lap[] pakli=new Lap[22];
    public KartyaPakli() {
        feltolt();
    }

    public static Lap[] getPakli() {
        return pakli;
    }

    public void keveres(int szam) {
        switch(szam){
            case 1: kev1();
            break;
            case 2: kev2();
            break;
            case 3: kev3();
            break;
                    
        }
    }

    private void kev1() {
        for (int i = 1; i < 8; i++) {
                    pakli[i]=pakli[(19-(i-1)*3)];
                }
                for (int i = 1; i < 8; i++) {
                    pakli[i+7]=pakli[(20-(i-7)*3)];
                }
                for (int i = 1; i < 8; i++) {
                pakli[i+14]=pakli[(21-(i-14)*3)];
                }
    }

    private void kev2() {
        for (int i = 1; i < 8; i++) {
            pakli[i]=pakli[(20-(i-1)*3)];
            }
        for (int i = 1; i < 8; i++) {
            pakli[i+7]=pakli[(21-(i-7)*3)];
            }
        for (int i = 1; i < 8; i++) {
            pakli[i+14]=pakli[(19-(i-14)*3)];
            }
    }

    private void kev3() {
        for (int i = 1; i < 8; i++) {
            pakli[i]=pakli[(21-(i-1)*3)];
            }
        for (int i = 1; i < 8; i++) {
            pakli[i+7]=pakli[(19-(i-7)*3)];
            }
        for (int i = 1; i < 8; i++) {
            pakli[i+14]=pakli[(20-(i-14)*3)];
            }
        }
    

    public Lap[] feltolt(){
        String[] ertek ={"asz","kir","fel","x","Ix","VIII"};   
        String[] szin ={"T","Z","P","O"}; 
        int number=0;
        for (String szinek:szin){
            for(String ertekek:ertek){
                Lap ujlap=new Lap(ertekek,szinek);
                if(number<21){pakli[++number]=ujlap;}
            }
            
        }
        return pakli;
    }
    
    public void ezVolt(){
        System.out.println("A " + pakli[11] + " lapott válsztottad");
    }
    
    
}