
package oop_lab9;

public class Fish extends Animal {
    int sizeInFt;
    Boolean canEat;
    public Fish(int a, String g, int s, Boolean e){
        super(a,g);
        sizeInFt = s;
        canEat = e;
    }
    
    void swim(){
        System.out.println("Fish is swimming");
    }
    
    void voice(){
        System.out.println("blop");
    }
    
    String isMammal(){
        return "Is Not Mammal";
    }
    
     public String toString(){
       return (this.getClass().getSimpleName() + " " +  isMammal());
    }
}
