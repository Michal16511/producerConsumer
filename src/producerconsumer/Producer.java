
package producerconsumer;

public class Producer implements Runnable {
    
    private Shop shop;
    
    public Producer(Shop shop)
    {
        this.shop = shop;
        
    }
    
    @Override
    public void run()
    {
        shop.putProduct();
    }
}
