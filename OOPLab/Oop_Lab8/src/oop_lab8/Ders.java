
package oop_lab8;


public class Ders {
    String ad;
    int sinif;
    String hoca;
    public static int dersSayisi;
    
    Ders(){
        dersSayisi++;
        ad = "none";
        sinif = 1;
        hoca = "none";
    }
    
    Ders(String a){
        dersSayisi++;
        ad = a;
        sinif = 1;
        hoca = "none";
    }
    
    Ders(String a, int s, String h){
        dersSayisi++;
        ad = a;
        sinif = s;
        hoca = h;
    }
    
    void DersBilgisiYaz(){
        System.out.println("Dersin Adı:" + ad);
        System.out.println("Sinif:" + sinif);
        System.out.println("Dersin Hocasi:" + hoca);
    }
    
    void DersSayıBilgisiYaz(){
        System.out.println("Ders Sayisi:" + dersSayisi);
    }
}
