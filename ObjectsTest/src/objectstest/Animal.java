
package objectstest;

public class Animal {
    int age;
    String name;
    
    public Animal(int animalAge, String animalName){      
        age = animalAge;
        name = animalName;
    }
    
    public void checkStatus(){
        System.out.println("Your pet it healthy and happy!");  
    }
    
    public void makeNoise(String sound){
        System.out.println(sound);  
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
   
    public void run(int feet){
        System.out.println("Your pet has ran " + feet + " feet");
    }
}
