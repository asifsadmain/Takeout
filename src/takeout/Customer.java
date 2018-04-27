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
public class Customer {
    Waiter order;

    public Customer() {
    }
    
    
    
    public void construct(Waiter order)
    {
        this.order = order;
        order.addPatty();
        order.addSauce();
        order.addCheese();
    }
}
