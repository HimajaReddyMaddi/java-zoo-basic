/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis;

/**
 *
 * @author S545156
 */
public class Giraffe extends Animal {
    
    @Override
    public void speak() {
        System.out.println("I'm Giraffe");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
        
    }
    
    @Override
    public void run(){
        System.out.println("I am running");
    }
    
    
}
