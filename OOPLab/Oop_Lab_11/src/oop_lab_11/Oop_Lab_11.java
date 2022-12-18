
package oop_lab_11;


public class Oop_Lab_11 {

    public static void main(String[] args) {
        Hayvan[] hayvanlar = {new Kedi("Boncuk"),
                                             new Köpek("Köpük"),
                                             new At("Gece"),
                                             new Kedi("Duman"),
                                             new Köpek("Tom"),
                                             new At("Gölge"),
                                             new Kedi("Lokum"),
                                             new Köpek("Paskal"),
                                             new At("Ateş"),
                                             new Kedi("Zeytin")};
        for(Hayvan h : hayvanlar){
            System.out.println(h.toString());
        }
    }
    
}
