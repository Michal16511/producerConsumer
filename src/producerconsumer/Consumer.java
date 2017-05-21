
package producerconsumer;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {
    
    private Shop shop;
    private Food food;
    private int id;
    
    public Consumer(Shop shop, int id)
    {
        this.shop = shop;
        this.id = id;
    }
    
    @Override
    public void run()
    {   
        while(true)
        {
            shop.getProduct(id);
            
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {}
        }
    }
}
