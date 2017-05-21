
package producerconsumer;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Shop {
    
    private LinkedList<Food> list = new LinkedList<Food>();
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
        if(list.isEmpty())
        {
            try{
                wait();
            } catch (InterruptedException ex) {}
        }
        
        food = list.removeLast();
        System.out.print("Watek numer " + id + " zjadlem: ");food.getName();
        notify();
        try {
            wait();
        } catch (InterruptedException ex) {}
    }
    
   public synchronized void putProduct()
   {
        while(list.size() != max){
            amount += 1;
            System.out.print("Wyprodukowalem " + amount + " produkt: ");
            food = factory.getFood();
            food.getName();
            list.addFirst(food);
        }
        notify();
   }
}
