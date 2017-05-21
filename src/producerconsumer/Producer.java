
package producerconsumer;

public class Producer implements Runnable {
    
    private Factory factory = new Factory();
    private Shop shop;
    
    public Producer(Shop shop)
    {
        this.shop = shop;
    }
    
    @Override
    public void run()
    {
        synchronized(this)
        {
            shop.putProduct(factory.getFood());
        }
        
    }
}
