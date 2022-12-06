
package oop_lab9;


public class Zebra extends Animal {
    Boolean isWild;
    
    public Zebra(int a, String g, Boolean w){
        super(a,g);
        isWild = w;
    }
    
    void run(){
        System.out.println("Zebra is running");
    }
    
    void voice(){
        System.out.println("bray");
    }
    
    String isMammal(){
        return "Is Mammal";
    }
    
    public String toString(){
        return (this.getClass().getSimpleName() + " " +  isMammal());
    }
}
