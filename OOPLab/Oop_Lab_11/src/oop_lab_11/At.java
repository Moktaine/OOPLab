
package oop_lab_11;

public class At extends Hayvan{
    At(String ad){
        super(ad);
    }
    public String getIsim(){
        return super.isim;
    }
    public String getKonus(){
        return "Niha";
    }
    public String toString(){
        return getIsim() + " " + getKonus() ;
    }
}
