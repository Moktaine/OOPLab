
package oop_lab_11;


public class Kedi extends Hayvan{
    Kedi(String ad){
        super(ad);
    }
    public String getIsim(){
        return super.isim;
    }
    public String getKonus(){
        return "Miyav";
    }
    public String toString(){
        return getIsim() + " " + getKonus() ;
    }
}
