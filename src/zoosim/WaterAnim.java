/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author koosh
 */
public class WaterAnim extends Animal implements ISwimmable {
    
    //Decalre the WaterAnim fields
    private boolean canBreath; 
    
    //Create a constructor to set the name
     public WaterAnim (String name){
        
        super(name); 
    }
    
    //Decalre a method to bring the animal to the surface
    public void canSurface(){
        System.out.println("The" + super.getName() +" is on the surface");
    }
    
}
