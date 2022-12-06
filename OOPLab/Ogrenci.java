
package oop_lab8;
import java.util.ArrayList;

public class Ogrenci {
    String ad;
    int sinif;
    ArrayList<Ders> derslistesi = new ArrayList<Ders>();
    static int ogrenciSayisi;

    Ogrenci(){
        ogrenciSayisi++;
        ad = "none";
        sinif = 1;
    }
    
    Ogrenci(String a, ArrayList<Ders> d){
        ogrenciSayisi++;
        ad = a;
        sinif = 1;
        derslistesi = d;
    }
    
    Ogrenci(String a, int s, ArrayList<Ders> d){
        ogrenciSayisi++;
        ad = a;
        sinif = s;
        derslistesi = d;
    }
    
    void OgrenciBilgisiYaz(){
        System.out.println("Adi:" + ad);
        System.out.println("Sinifi:" + sinif);
        System.out.println("Ogrenci Sayisi:" + ogrenciSayisi);
        System.out.println("Almıs Oldugu Ders Sayisi:" + derslistesi.size());
    }
    
    void OgrenciDersBilgiYaz(){
        for (int i = 0; i < derslistesi.size(); i++) {
            derslistesi.get(i).DersBilgisiYaz();
            System.out.println("");
        }
    }
}
