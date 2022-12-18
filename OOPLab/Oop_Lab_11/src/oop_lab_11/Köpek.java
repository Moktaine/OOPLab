
package oop_lab_11;


public class Köpek extends Hayvan{
    Köpek(String ad){
        super(ad);
    }
    public String getIsim(){
        return super.isim;
    }
    public String getKonus(){
        return "Hav";
    }
    public String toString(){
        return getIsim() + " " + getKonus() ;
    }
}
