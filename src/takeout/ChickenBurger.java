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
public class ChickenBurger implements Waiter{
    Burger chickenBurger = new Burger();

    public ChickenBurger() {
    }

    @Override
    public void addPatty() {
        chickenBurger.setPatty("chicken patty");
    }

    @Override
    public void addSauce() {
        chickenBurger.setSauce("tomato sauce");
    }

    @Override
    public void addCheese() {
        chickenBurger.setCheese("special cheese");
    }

    @Override
    public Burger getBurger() {
        return chickenBurger;
    }
    
    
}
