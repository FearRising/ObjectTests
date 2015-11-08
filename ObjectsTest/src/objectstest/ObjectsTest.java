
package objectstest;


public class ObjectsTest{
    public static void main(String[] args) {
        
        Animal spike = new Animal(2, "Spike");
        
        spike.makeNoise("Woof!");
        int spikeAge = spike.getAge();
        String spikeName = spike.getName();
        System.out.println(spikeName + " is " + spikeAge + " years old");
        spike.run(123);

        System.out.println("\n\n\n");
        Animal tiddles = new Animal(2, "Tiddles");
        
        tiddles.makeNoise("Meow!");
        int tiddlesAge = tiddles.getAge();
        String tiddlesName = tiddles.getName();
        System.out.println(tiddlesName + " is " + tiddlesAge + " years old");
        tiddles.run(30);
        
        System.out.println("\n\n\n");
        
        Animal um = new Animal(50, "Um");
        int umAge = um.getAge();
        String umName = um.getName();
        um.makeNoise("Rawwr!");
        System.out.println(umName + " is " + umAge + " years old");
        um.run(30);
        
        
    }
    
}
