package keveres;
    
public class KartyaPakli {

    static Lap[] pakli=new Lap[21];
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
    Lap[] regiPakli = pakli.clone();
    for (int i = 0; i < 7; i++) {
        pakli[i]=regiPakli[20-i*3];
        pakli[i+7]=regiPakli[19-i*3];
        pakli[i+14]=regiPakli[18-i*3];
    }
}

private void kev2() {
    Lap[] regiPakli = pakli.clone();
    for (int i = 0; i < 7; i++) {
        pakli[i]=regiPakli[19-i*3];
        pakli[i+7]= regiPakli[20-i*3];
        pakli[i+14]= regiPakli[18-i*3];
    }
}

private void kev3() {
    Lap[] regiPakli = pakli.clone();
    for (int i = 0; i < 7; i++) {
        pakli[i]=regiPakli[20-i*3];
        pakli[i+7]=regiPakli[18-i*3];
        pakli[i+14]=regiPakli[19-i*3];
    }
}
    
    

    public Lap[] feltolt(){
        String[] ertek ={"asz","kir","fel","x","Ix","VIII"};   
        String[] szin ={"T_","Z_","P_","O_"}; 
        int number=0;
        for (String szinek:szin){
            for(String ertekek:ertek){
                Lap ujlap=new Lap(ertekek,szinek);
                if(number<21){pakli[number++]=ujlap;}
            }
            
        }
        return pakli;
    }
    
    public void ezVolt(){
        System.out.println("A " + pakli[11].getSzin()+pakli[11].getErtek() + " lapott válsztottad");
    }
    
    
}