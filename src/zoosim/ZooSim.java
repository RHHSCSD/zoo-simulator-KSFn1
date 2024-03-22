/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Delcare an animal array
        Animal[] animals = new Animal [10]; 
        
        
        feed(animals);
        sleep(animals); 
        stats(animals); 
        move(animals); 
        addAnimal(animals, new Animal());
        
     
    }
    
    //Create a method to add an animal to the zoo
   public static void addAnimal(Animal[] animals, Animal newAnimal) {
        // Find an empty spot in the array
        int index = 0;
        while (index < animals.length && animals[index] != null) {
            index++;
        }
        
        // Add the new animal if there's space
        if (index < animals.length) {
            animals[index] = newAnimal;
            System.out.println(newAnimal.getName() + " added to the zoo!");
        } else {
            System.out.println("No more space in the zoo!");
        }
    }
    
    
    //Create a method to move the animals
    public static void move (Animal[] animals){
        
       //Run a for loop to go through each animal one by one
        for (int i = 0; i < animals.length; i++){
            
            //Create a new animal
            animals[i] = new Animal();
        }

        //Run a for each loop to go through each animal
        for (Animal animal : animals){
            //feed the animal
            animal.move(30, 30);
        }
    }
    
    //Create a method to display zoo stats
    public static void stats (Animal[] animals){
 
    
        System.out.println("There are " + animals.length + " animals in the zoo" );
    }
    
    
    
    //Create a method to feed all animals
    public static void feed (Animal[] animals){
        
        //Run a for loop to go through each animal one by one
        for (int i = 0; i < animals.length; i++){
            
            //Create a new animal
            animals[i] = new Animal();
        }

        //Run a for each loop to go through each animal
        for (Animal animal : animals){
            //feed the animal
            animal.eat();
        }
    
    
    }
    
    
       //Create a method to feed all animals
    public static void sleep (Animal[] animals){
        
        //Run a for loop to go through each animal one by one
        for (int i = 0; i < animals.length; i++){
            
            //Create a new animal
            animals[i] = new Animal();
        }

        //Run a for each loop to go through each animal
        for (Animal animal : animals){
            //Make the animal sleep
            animal.sleep();
        }
    
    
    }
    
}
