
package oop_lab_10;
import java.util.Scanner;

public class Cilek implements IMeyve{
    double kgFiyatı, kgAlinan;
    Cilek(Scanner scan){
        System.out.println("Cilek Kg Fiyatını giriniz: ");
        double FiyatKg = scan.nextDouble();
        System.out.println("Kac Kg alınacak: ");
        double alinanKg = scan.nextDouble();
        kgFiyatı = FiyatKg;
        kgAlinan = alinanKg;
    }
    public void meyveadi(){
        System.out.println("Cilek");
    }
    public void alinankg(double k){
        System.out.println(" " + kgAlinan+ "kg cilek alınmıstır");
    }
    public double fiyat(){
        return kgFiyatı*kgAlinan;
    }
    
    
}
