
package ooplab7;


public class OopLab7 {

    
    public static void main(String[] args) {
        Sinema sinema1  = new Sinema(1, 150);
        Sinema sinema2  = new Sinema(2,100);
        Sinema sinema3 = new Sinema(3,85);
        
        System.out.println(sinema1.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema1.BosKoltukOgren());
        System.out.println(sinema2.SalonNo + " Numaralı Salondaki Toplam Satilan Bilet Sayisi:" + sinema2.TumSatilanBiletSayisiniOgren());
        System.out.println(sinema3.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema3.BosKoltukOgren());
        
        System.out.println();
        
        sinema1.BiletSat();
        sinema2.BiletSat();
        sinema3.BiletSat();
        
        System.out.println();
        
        System.out.println(sinema1.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema1.BosKoltukOgren());
        System.out.println(sinema2.SalonNo + " Numaralı Salondaki Toplam Satilan Bilet Sayisi:" + sinema2.TumSatilanBiletSayisiniOgren());
        System.out.println(sinema3.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema3.BosKoltukOgren());
        
        System.out.println();
        
        sinema1.BiletIptal();
        sinema2.BiletIptal();
        sinema3.BiletIptal();
        
        System.out.println();
        
        System.out.println(sinema1.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema1.BosKoltukOgren());
        System.out.println(sinema2.SalonNo + " Numaralı Salondaki Toplam Satilan Bilet Sayisi:" + sinema2.TumSatilanBiletSayisiniOgren());
        System.out.println(sinema3.SalonNo + " Numaralı Salondaki Bos Koltuk Sayisi:" + sinema3.BosKoltukOgren());
        
    }
    
}
