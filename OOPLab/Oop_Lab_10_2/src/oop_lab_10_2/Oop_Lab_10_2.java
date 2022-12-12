
package oop_lab_10_2;
import java.util.Scanner;

public class Oop_Lab_10_2 {

    static double inputFiyat(String s){
        Scanner scan = new Scanner(System.in);
        System.out.print(s + " kg fiyatını giriniz: ");
        return scan.nextDouble();
    }
    static double inputAlinanKg(String s){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac kg " +s+" alınacak: ");
        return scan.nextDouble();
    }
    
    public static void main(String[] args) {
        double alinanKg=0,kgFiyat=0, toplamMaliyet=0;
        kgFiyat = inputFiyat("Cilek");
        alinanKg = inputFiyat("Cilek");
        Cilek c = new Cilek(alinanKg,kgFiyat);
        toplamMaliyet+=c.fiyat();
        
        kgFiyat = inputFiyat("Armut");
        alinanKg = inputFiyat("Armut");
        Armut a = new Armut(alinanKg,kgFiyat);
        toplamMaliyet+=a.fiyat();
        
        kgFiyat = inputFiyat("Elma");
        alinanKg = inputFiyat("Elma");
        Elma e = new Elma(alinanKg,kgFiyat);
        toplamMaliyet+=e.fiyat();
        
        kgFiyat = inputFiyat("Karpuz");
        alinanKg = inputFiyat("Karpuz");
        Karpuz k = new Karpuz(alinanKg,kgFiyat);
        toplamMaliyet+=k.fiyat();
        
        System.out.println("--------------");
        System.out.println("Cilek maliyeti: " + c.fiyat());
        System.out.println("Armut maliyeti: " + a.fiyat());
        System.out.println("Elma maliyeti: " + e.fiyat());
        System.out.println("Karpuz maliyeti: " + k.fiyat());
        System.out.println("Toplam Maliyet: "+ toplamMaliyet);
    }
    
}
