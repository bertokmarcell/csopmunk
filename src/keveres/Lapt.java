
package keveres;
    
public class Lapt {
    private String ertek;
    private String szin;
    public Lapt(String ertek,String szin) {
        this.ertek=ertek;
        this.szin=szin;
    }

    public String getErtek() {
        return ertek;
    }

    public String getSzin() {
        return szin;
    }
    
    public void kiir(){
        System.out.print(getErtek()+" "+getSzin());
    }
    
   
}
