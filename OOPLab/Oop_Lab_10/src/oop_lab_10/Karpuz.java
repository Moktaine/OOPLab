
package oop_lab_10;
import java.util.Scanner;

public class Karpuz implements IMeyve {
    double kgFiyatı, kgAlinan;
    Karpuz(Scanner scan){
        System.out.println("Karpuz Kg Fiyatını giriniz: ");
        double FiyatKg = scan.nextDouble();
        System.out.println("Kac Kg alınacak: ");
        double alinanKg = scan.nextDouble();
        kgFiyatı = FiyatKg;
        kgAlinan = alinanKg;
    }
    public void meyveadi(){
        System.out.println("Karpuz");
    }
    public void alinankg(double k){
        System.out.println(" " + kgAlinan+ "kg karpuz alınmıstır");
    }
    public double fiyat(){
        return kgFiyatı*kgAlinan;
    }
    
    
}
