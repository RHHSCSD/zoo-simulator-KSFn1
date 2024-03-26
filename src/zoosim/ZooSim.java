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
        String name2 = "goat";
        
        
        
        //Delcare an animal array
        Animal[] animals = new Animal [10]; 
        
        animals[0] = horse; 
        animals[1] = fish; 
        animals[2] = eagle; 
        animals[3] = cat; 
        
        //Decalre a counter variable
        int counter = 0; 
        
        //run a for loop that counts the number of animals in the zoo
        for (int i = 0; i < animals.length; i++){
            
         if (animals[i] == null){
         
         break; }   
         
         else {
             counter++; 
         }
        }
        //Refer to the methods
        counter = addAnimal(animals, name, counter);
        name = name2; 
        counter = addAnimal(animals, name, counter);
        feed(animals, counter);
        sleep(animals, counter); 
        stats(animals, counter); 
        move(animals, counter); 
        counter = removeAnim(animals, counter); 
        stats(animals, counter);
        
     
    }
    
    //Create a method to add an animal to the zoo

    /**
     *
     * @param animals
     * @param name
     * @param counter
     * @return
     */
   public static int addAnimal(Animal[] animals, String name, int counter) {
    // Check if the animals array is full
    if (counter >= animals.length) {
        System.out.println("No more space in the zoo!");
        return counter;
    }
    
    // Create a new animal with the name passed in
    Animal newAnimal = new LandAnim(name); // Assuming LandAnim is the correct subclass
    animals[counter] = newAnimal;
    //Output that a new animals was added
       System.out.println("A " + name + " was added to the zoo!");
       
       //Add one to the counter
       counter++; 

    // Return the updated animal array
    return counter;
}
   
   
   
   //Create a method to remove an animal from the zoo

    /**
     *
     * @param animals
     * @param counter
     * @return
     */
public static int removeAnim(Animal[] animals, int counter) {
    // Check if there are any animals in the zoo
    if (counter == 0) {
        System.out.println("No animals to remove from the zoo.");
        return counter;
    }

    // Output that an animal was removed
    System.out.println("A " + animals[counter - 1].getName() + " was removed from the zoo!");

    // Change the last animal added to the zoo to null
    animals[counter - 1] = null;

    // Decrement counter to reflect the removal of an animal
    counter--;
    
    //Return
    return counter; 
}

    
    
    //Create a method to move the animals

    /**
     *
     * @param animals
     * @param counter
     */
    public static void move(Animal[] animals, int counter) {
        // Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
        animals[i].move(30, 30);
}
}

    
    
    //Create a method to display zoo stats

    /**
     *
     * @param animals
     * @param counter
     */
    public static void stats (Animal[] animals, int counter){
        System.out.println("There are " + counter + " animals in the zoo" );
    }
    
    
    
    //Create a method to feed all animals

    /**
     *
     * @param animals
     * @param counter
     */
    public static void feed (Animal[] animals, int counter){

        //Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
            //feed the animal
            animals[i].eat();
        }
    
    
    }
    
    
       //Create a method to feed all animals

    /**
     *
     * @param animals
     * @param counter
     */
    public static void sleep (Animal[] animals, int counter){
        
       //Run a for each loop to go through each animal
        for (int i = 0; i < counter; i++) {
            //feed the animal
            animals[i].sleep();
        }
    
    
    }
    
}
