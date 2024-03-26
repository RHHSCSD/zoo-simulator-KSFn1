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
        
        
        
        
        //Decalre animal objects
        Animal horse = new LandAnim ("horse"); 
        Animal fish = new WaterAnim ("fish"); 
        Animal eagle = new BirdAnim("eagle"); 
        Animal cat = new Animal("cat"); 
        String name = "lion"; 
        
        
        //Delcare an animal array
        Animal[] animals = new Animal [10]; 
        
        animals[0] = horse; 
        animals[1] = fish; 
        animals[2] = eagle; 
        animals[3] = cat; 
        
        //Decalre a counter variable
        int counter = 0; 
        
        //run a for loop that lops through the animal array
        for (int i = 0; i < animals.length; i++){
            
         if (animals[i] == null){
         
         break; }   
         
         else {
             counter++; 
         }
        }
        animals = addAnimal(animals, name, counter);
        feed(animals, counter);
        sleep(animals, counter); 
        stats(animals, counter); 
        move(animals, counter); 
        
        
     
    }
    
    //Create a method to add an animal to the zoo
   public static Animal[] addAnimal(Animal[] animals, String name, int counter) {
        
       //Create a new animal with the name passed in
       Animal newAnimal = new Animal (name); 
       animals[counter++] = newAnimal; 
      
       return animals; 
    }
    
    
    //Create a method to move the animals
    public static void move(Animal[] animals, int counter) {
        // Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
        animals[i].move(30, 30);
}
}

    
    
    //Create a method to display zoo stats
    public static void stats (Animal[] animals, int counter){
        System.out.println("There are " + counter + " animals in the zoo" );
    }
    
    
    
    //Create a method to feed all animals
    public static void feed (Animal[] animals, int counter){

        //Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
            //feed the animal
            animals[i].eat();
        }
    
    
    }
    
    
       //Create a method to feed all animals
    public static void sleep (Animal[] animals, int counter){
        
       //Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
            //feed the animal
            animals[i].sleep();
        }
    
    
    }
    
}
