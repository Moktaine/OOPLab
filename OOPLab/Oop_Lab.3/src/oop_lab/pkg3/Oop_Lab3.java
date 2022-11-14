
package oop_lab.pkg3;

import java.util.*;

public class Oop_Lab3 {


    public static void main(String[] args) {
        System.out.println("1. Soru:");
       /*Daire Çevresi ve Alanını Hesaplama*/
       Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçapı Giriniz:");
       double yaricap = scan.nextDouble();
       double cevre, alan;
       
       cevre = 2 * Math.PI * yaricap;
       alan = Math.PI * Math.PI * yaricap;
       
        System.out.println("Dairenin Çevresi:" + cevre);
        System.out.println("Dairenin Alanı:" + alan);
        
       System.out.println("2. Soru:");
       /*Denklemlerin Sonucunu Bulma */
      
      double x, y, denk1, denk2;
       
      x = 1.2;
      y = 14;
      denk1 = ((3 * x + 7) / y) * ((3 * x + 7) / y);
      
      x = 6;
      y = 4;
      denk2 = (x * x + 2 * y) / ((y * y) / 2);
      
      System.out.println("1. Denklemin Sonucu = " + denk1);
      System.out.println("2. Denklemin Sonucu = " + denk2);
       
    }
    
}
