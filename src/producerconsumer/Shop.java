
package producerconsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Shop {
    private LinkedList<Food> list = new LinkedList<Food>();
    private int max = 25;
    
    public synchronized Food getProduct()
    {
        
        if(list.isEmpty())
        {
            try{
                wait();
            } catch (InterruptedException ex) {}
        }
        Food food = list.removeLast();
        notify();
        return food;
    }
    
   public synchronized void putProduct(Food food)
   {
       if(list.size() == max)
       {
           try{
                wait();
            } catch (InterruptedException ex) {}
       }
       list.addFirst(food);
       notify();
   }
}
