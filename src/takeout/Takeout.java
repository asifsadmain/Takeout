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



public class Takeout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer student = new Customer();
        
        Waiter order1 = new BeefBurger();
        Waiter order2 = new ChickenBurger();
        
        student.construct(order1);
        student.construct(order2);
        
        Burger beefBurger = order1.getBurger();
        Burger chickenBurger = order2.getBurger();
        
        System.out.println("The beef burger is made of "+beefBurger.getPatty()+","+beefBurger.getSauce()+","+beefBurger.getCheese());
        System.out.println("The chicken burger is made of "+chickenBurger.getPatty()+","+chickenBurger.getSauce()+","+chickenBurger.getCheese());
    }
    
}
