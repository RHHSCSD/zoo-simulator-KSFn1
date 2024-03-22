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
    private char size; 
    private int speed; 
    private int direction = 0; 
    private int hunger; 
    private int fatigue; 
    private Image image; 
    private String sound;
    
    
    //Declare a method for the animal to make sounds 
    public void makeSound(){
        System.out.println("Animal sounds");
    }
    
    //Decalre a method for the animal to move
    public void move (int x, int y){
        
        //Add the postion to the existing postion
        this.xposition += x; 
        this.yposition += y; 
        
        System.out.println("The animal is moving");
    }
    
    //Decalre a method for the animal to restore hunger
    public void eat(){
        this.hunger = 100; 
        System.out.println("The animal is not hungary anymore");
    }
    
    //Declare a method for the animal to restore fatigue
    public void sleep(){
        this.fatigue = 100; 
        System.out.println("The animal is not tired anymore");
    }
    
    //Declare a method for the animal to turn
    public void turn (int degrees){
        
        //Add the degrees to the directions
        this.direction += degrees; 
        
        //Reset the direction back to 0 if it passes 360
        if (direction > 360){
            direction = direction - 360; 
        }
    }
    
    //Declare a method for the animal to be placed at
    public void place (int x, int y){
        this.xposition = x; 
        this.yposition = y;
    }
    
    //Create a method to get the name
    public String getName(){
        return name; 
    }
    
}       
