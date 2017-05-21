
package producerconsumer;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Shop {
    
    private BlockingQueue<Food> list = new LinkedBlockingQueue<Food>(25);
    private int max = 25;
    private int amount = 0;
    private Food food;
    private Factory factory = new Factory();
    
    public boolean notEmpty()
    {
        return !list.isEmpty();
    }
    
    public boolean isFull()
    {
        return list.size() == 25;
    }
            
    public synchronized void getProduct(int id)
    {
        try {
            food = list.poll(5,TimeUnit.MICROSECONDS);
            System.out.print("Watek numer " + id + " zjadlem produkt numer: " + food.getId());food.getName();
        } catch (InterruptedException ex) {}
          catch (NullPointerException e){}
        
    }
    
   public synchronized void putProduct()
   {
       amount += 1;
       System.out.print("Wyprodukowalem produkt numer: "  + amount);
       food = factory.getFood();
       food.getName();
       try {
           list.put(food);
       } catch (InterruptedException ex) {}
       
   }
}
