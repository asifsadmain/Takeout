/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

/**
 *
 * @author asif
 */
public class BeefBurger implements Waiter{
    Burger beefBurger = new Burger();

    public BeefBurger() {
    }

    @Override
    public void addPatty() {
        beefBurger.setPatty("beef patty");
    }

    @Override
    public void addSauce() {
        beefBurger.setSauce("Chilli sauce");
    }

    @Override
    public void addCheese() {
        beefBurger.setCheese("Yummy cheese");
    }

    @Override
    public Burger getBurger() {
        return beefBurger;
    }
    
    
}
