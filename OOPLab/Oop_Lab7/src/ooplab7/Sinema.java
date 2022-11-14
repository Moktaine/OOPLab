
package ooplab7;

public class Sinema {
    int SalonNo;
    int ToplamKoltukSayisi;
    int SatilanBiletSayisi;
    int ToplamSatilanBiletSayisi;
    
    void BiletSat(){
        SatilanBiletSayisi++;
        ToplamSatilanBiletSayisi++;
        System.out.println(SalonNo + " Numaralı salonda 1 bilet satın alındı.");
    }
    
    void BiletIptal(){
        SatilanBiletSayisi--;
        ToplamSatilanBiletSayisi--;
        System.out.println(SalonNo + " Numaralı salonda 1 bilet iptal edildi.");
    }
    
    int BosKoltukOgren(){
        return ToplamKoltukSayisi - SatilanBiletSayisi;
    }
    
    int TumSatilanBiletSayisiniOgren(){
        return ToplamSatilanBiletSayisi;
    }
    
    public Sinema(int salonNo, int toplamKoltukSayisi){
        SalonNo = salonNo;
        ToplamKoltukSayisi = toplamKoltukSayisi;
        SatilanBiletSayisi = 0;
        ToplamSatilanBiletSayisi = 0;
    }
    
    public Sinema(){
        SalonNo = 1;
        ToplamKoltukSayisi = 100;
        SatilanBiletSayisi = 0;
        ToplamSatilanBiletSayisi = 0;
    }
    
    
}
