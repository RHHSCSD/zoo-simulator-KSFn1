/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author koosh
 */
public class OtherObjects implements IObjects{
    
    //Decalre the object fields
    private String type; 
    private int xposition; 
    private int yposition; 
    private char size; 
    
    
    //Declare a method for the object to move
     public void turn (int degrees){
         System.out.println("The object was turned by " + degrees + " degrees");
     }
     
     //Declare a method to set the position of the object
    public void place (int x, int y){
        
        //Update the exisiting fields 
        this.xposition = x; 
        this.yposition = y; 
        
        System.out.println("The object is at " + xposition + ", " + yposition);
    }
    
}
