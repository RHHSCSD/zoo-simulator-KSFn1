/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author koosha
 */
public class Animal implements IEntity{
    
    //Declare the animal fields
    private String id; 
    private String name; 
    private String species; 
    private Boolean sex; 
    private Double age; 
    private int xposition = 0; 
    private int yposition = 0; 
    private int size; 
    private int speed; 
    private int direction = 0; 
    private int hunger; 
    private int fatigue; 
    private Image image = new Image(); 
    private String sound;
    
    
    //Create constructors

    /**
     *
     */
    public Animal (){}; 

    /**
     *
     * @param name
     */
    public Animal (String name){
        
        this.name = name; 
    }
    //Declare a method for the animal to make sounds 

    /**
     *
     */
    public void makeSound(){
        System.out.println("Animal sounds...");
    }
    
    //Decalre a method for the animal to move

    /**
     *
     * @param x
     * @param y
     */
    public void move (int x, int y){
        
        //Add the postion to the existing postion
        this.xposition += x; 
        this.yposition += y; 
        
        System.out.println("The " + this.name + " is moving. The " + this.name + " is now at " + x + ", " + y +".");
    }
    
    //Decalre a method for the animal to restore hunger

    /**
     *
     */
    public void eat(){
        this.hunger = 100; 
        System.out.println("The " + this.name + " is not hungary anymore.");
    }
    
    //Declare a method for the animal to restore fatigue

    /**
     *
     */
    public void sleep(){
        this.fatigue = 100; 
        System.out.println("The " + this.name + " is not tired anymore.");
    }
    
    //Declare a method for the animal to turn

    /**
     *
     * @param degrees
     */
    public void turn (int degrees){
        
        //Add the degrees to the directions
        this.direction += degrees; 
        
        //Reset the direction back to 0 if it passes 360
        if (direction > 360){
            direction = direction - 360; 
        }
    }
    
    //Declare a method for the animal to be placed at

    /**
     *
     * @param x
     * @param y
     */
    public void place (int x, int y){
        this.xposition = x; 
        this.yposition = y;
    }
    
    //Create a method to get the name

    /**
     *
     * @return
     */
    public String getName(){
        return name; 
    }
    
    //Create a method to set the name

    /**
     *
     * @param name
     */
    public void setName (String name){
        this.name = name; 
        
    }
    
}       
