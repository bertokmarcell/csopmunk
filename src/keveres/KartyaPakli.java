package keveres;
    
public class KartyaPakli {

    static Lapt[] pakli=new Lapt[22];
    public KartyaPakli() {
        
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
    private void kev1()
    
    
}