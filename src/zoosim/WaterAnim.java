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
    
    //Decalre a method to bring the animal to the surface
    public void canSurface(){
        System.out.println("This animal is on the surface");
    }
    
}
