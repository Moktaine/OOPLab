
package oop_lab_10;
import java.util.Scanner;

public class Elma implements IMeyve {
    double kgFiyatı, kgAlinan;
    Elma(Scanner scan){
        System.out.println("Elma Kg Fiyatını giriniz: ");
        double FiyatKg = scan.nextDouble();
        System.out.println("Kac Kg alınacak: ");
        double alinanKg = scan.nextDouble();
        kgFiyatı = FiyatKg;
        kgAlinan = alinanKg;
    }
    public void meyveadi(){
        System.out.println("Elma");
    }
    public void alinankg(double k){
        System.out.println(" " + kgAlinan + "kg elma alınmıstır");
    }
    public double fiyat(){
        return kgFiyatı*kgAlinan;
    }
    
}
