
package oop_lab9;
import java.util.ArrayList;

public class Oop_Lab9 {


    public static void main(String[] args) {
        Animal animal1 = new Animal(4, "male");
        Animal animal2 = new Fish(2,"female", 3, true);
        
        Duck duck1 = new Duck(3, "female", "blue");
        Animal animalDuck = new Duck(2, "female", "red");
        Duck duck2 = (Duck)animalDuck;
        Duck duck3 = new Duck(1, "male", "yellow");
        
        Fish fish1 = new Fish(1, "female", 2, false);
        Animal animalFish = new Fish(2,"male", 3, true);
        Fish fish2 = (Fish)animalFish;
        
        Zebra zebra1 = new Zebra(5, "female", true);
        Animal animalZebra = new Zebra(2, "male", false);
        Zebra zebra2 = (Zebra)animalZebra;
        
        Zebra zebra3 = new Zebra(1, "male", false);
        Zebra zebra4 = new Zebra(3, "female", true);
        
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        
        animalList.add(animal2);
        animalList.add(animal1);
        animalList.add(duck1);
        animalList.add(duck2);
        animalList.add(duck3);
        animalList.add(fish1);
        animalList.add(fish2);
        animalList.add(zebra1);
        animalList.add(zebra2);
        animalList.add(zebra3);
        animalList.add(zebra4);
                                
        
        for (int i = 0; i < animalList.size(); i++) {    
            System.out.println(animalList.get(i).getClass().getSimpleName());
            System.out.println("---------------------");
            if(animalList.get(i).getClass() == Fish.class){
                Fish f = (Fish)animalList.get(i);
                f.swim();
                System.out.println(f.toString());
            }else if(animalList.get(i).getClass() == Duck.class){
                Duck d = (Duck)animalList.get(i);
                d.swim();
                System.out.println(d.toString());
                d.quack();
            }else if(animalList.get(i).getClass() == Zebra.class){
                Zebra z = (Zebra)animalList.get(i);
                z.run();
                System.out.println(z.toString());
            }
            animalList.get(i).voice();
            animalList.get(i).mate();
            animalList.get(i).sleep();
            System.out.println("---------------------");
        }
    }
    
}
