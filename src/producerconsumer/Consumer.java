
package producerconsumer;

public class Consumer implements Runnable {
    
    private Shop shop;
    private Food food;
    
    public Consumer(Shop shop)
    {
        this.shop = shop;
    }
    
    @Override
    public void run()
    {
        synchronized(this)
        {
            food = shop.getProduct();
            System.out.print("Zjadlem: ");
            food.getName();
        }
    }
    
}
