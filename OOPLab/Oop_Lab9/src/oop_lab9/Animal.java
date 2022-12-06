
package oop_lab9;


public class Animal {
    int age;
    String gender;
    

    
    public Animal(int a, String g){
        age = a;
        gender = g;
    }
    
    String isMammal(){
        return "Mammal";
    }
    
    void mate(){
        System.out.println("mate..");
    }
    
    void voice(){
        System.out.println("No Sound");
    }
    
    final void sleep(){
        System.out.println("Sleeping");
    }
}
