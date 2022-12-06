
package oop_lab9;

public class Duck extends Animal{
    String beakColor = "yellow";
    
    public Duck(int a, String g, String c){
        super(a,g);
        beakColor = c;
    }
    
    void swim(){
        System.out.println("Duck is Swimming");
    }
    
    void quack(){
        System.out.println("Duck Quack");
    }
    
    String isMammal(){
        return "Is Not Mammal";
    }
    
    void voice(){
        System.out.println("quack");
    }
    
     public String toString(){
        return (this.getClass().getSimpleName() + " " +  isMammal());
    }
}
