
package oop_lab_10;
import java.util.Scanner;

public class Armut implements IMeyve{
    double kgFiyatı, kgAlinan;
    Armut(Scanner scan){
        System.out.println("Armut Kg Fiyatını giriniz: ");
        double FiyatKg = scan.nextDouble();
        System.out.println("Kac Kg alınacak: ");
        double alinanKg = scan.nextDouble();
        kgFiyatı = FiyatKg;
        kgAlinan = alinanKg;
    }
    public void meyveadi(){
        System.out.println("Armut");
    }
    public void alinankg(double k){
        System.out.println(" " + kgAlinan + "kg armut alınmıstır");
    }
    public double fiyat(){
        return kgFiyatı*kgAlinan;
    }
    
}
