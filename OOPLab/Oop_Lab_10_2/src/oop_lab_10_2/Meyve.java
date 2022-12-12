
package oop_lab_10_2;


abstract public class Meyve {
    double alinanKg, fiyatKg;
    public Meyve(double a, double f){
        alinanKg = a;
        fiyatKg=f;
    }
    abstract void meyveAdi();
    double fiyat(){
        return alinanKg*fiyatKg;
    }
}
