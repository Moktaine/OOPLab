
package oop_lab_11;


abstract public class Hayvan implements ICanli {
    protected final String isim;
    Hayvan(String ad){
        isim = ad;
    }
    @Override
    abstract public String getKonus();
}
