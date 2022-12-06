
package oop_lab8;
import java.util.ArrayList;

public class ClassesAndMethods {
    public static void main(String[] args) {
        ArrayList<Ders> ogr2Dersler = new ArrayList<Ders>();
        ArrayList<Ders> ogr3Dersler = new ArrayList<Ders>();
        Ogrenci ogr1 = new Ogrenci();
        System.out.println("------Ogrenci 1 Bilgileri-----");
        ogr1.OgrenciBilgisiYaz();
        
        Ogrenci ogr2 = new Ogrenci("Ahmet", ogr2Dersler);
        System.out.println("------Ogrenci 2 Bilgileri-----");
        ogr2.OgrenciBilgisiYaz();
        
        Ogrenci ogr3 = new Ogrenci("Mehmet", 2, ogr3Dersler);
        System.out.println("------Ogrenci 3 Bilgileri-----");
        ogr3.OgrenciBilgisiYaz();
        
        System.out.println("---Ogrenci 1 Ders Bilgileri---");
        ogr1.OgrenciDersBilgiYaz();
        
        System.out.println("---Ogrenci 2 Ders Bilgileri---");
        ogr2.OgrenciDersBilgiYaz();
        
        System.out.println("---Ogrenci 3 Ders Bilgileri---");
        ogr3.OgrenciDersBilgiYaz();
        
        Ders matematik = new Ders();
        Ders fizik = new Ders("Fizik");
        Ders oop = new Ders("OOP", 2, "Ahmet Sayar");
        
        System.out.println("Dersler Ekleniyor....");
        
        ogr1.derslistesi.add(matematik);
        System.out.println("---Ogrenci 1 Ders Bilgileri---");
        ogr1.OgrenciDersBilgiYaz();
        
        ogr2.derslistesi.add(oop);
        ogr2.derslistesi.add(fizik);
        System.out.println("---Ogrenci 2 Ders Bilgileri---");
        ogr2.OgrenciDersBilgiYaz();
        
        ogr3.derslistesi.add(oop);
        ogr3.derslistesi.add(matematik);
        ogr3.derslistesi.add(fizik);
        System.out.println("---Ogrenci 3 Ders Bilgileri---");
        ogr3.OgrenciDersBilgiYaz();
        
        matematik.DersSayıBilgisiYaz();
    }
}