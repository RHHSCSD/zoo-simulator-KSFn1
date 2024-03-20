/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author koosh
 */
public class BirdAnim extends Animal implements IFlyable{
    
    //Declare the fileds
    private boolean canFly; 
    
    //Declare a method for the bird to fly
    public void fly(){
        System.out.println("The bird started flying");
    }
    
    //Declare a method for the bird to continue flying
    public void isFlying(){
        System.out.println("THe bird is flying");
    }
    
    //DEcalre a method for the bird to land
    public void land (){
        System.out.println("The bird landed");
    }
}
