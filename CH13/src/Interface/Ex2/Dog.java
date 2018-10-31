/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Ex2;

/**
 *
 * @author User
 */
public class Dog implements Animal{

    @Override
    public String eat() {
        return "Dog can eat";
    }

    @Override
    public String run() {
        return "Dog can run";
    }
    
}
