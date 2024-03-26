/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author koosha
 */
public interface IEntity extends IObjects{
    
    //Declare the interface methods

    /**
     *
     * @param x
     * @param y
     */
    public void move (int x, int y);

    /**
     *
     */
    public void makeSound (); 

    /**
     *
     */
    public void eat ();

    /**
     *
     */
    public void sleep(); 
    
}
