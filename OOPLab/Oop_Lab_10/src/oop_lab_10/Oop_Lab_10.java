
package oop_lab_10;
import java.util.Scanner;

public class Oop_Lab_10 {

    public static void main(String[] args) {
        double toplamMaliyet=0;
        Scanner s = new Scanner(System.in);
        Cilek c = new Cilek(s);
        Armut a = new Armut(s);
        Elma e = new Elma(s);
        Karpuz k = new Karpuz(s);
        
        System.out.println("Cilek fiyatı: "+c.fiyat());
        toplamMaliyet +=c.fiyat();
        System.out.println("Armut fiyatı: "+a.fiyat());
        toplamMaliyet +=a.fiyat();
        System.out.println("Elma fiyatı: "+e.fiyat());
        toplamMaliyet +=e.fiyat();
        System.out.println("Karpuz fiyatı: "+k.fiyat());
        toplamMaliyet +=k.fiyat();
        System.out.println("Toplam Maliyet: " + toplamMaliyet);
        
    }
    
}
