
package producerconsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

    public static void main(String[] args) {
        
        //ExecutorService executor = Executors.newFixedThreadPool(10); 
        Shop shop = new Shop();
        
        Runnable producer = new Producer(shop);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        
        Thread consumer1 = new Thread(new Consumer(shop,1));
        Thread consumer2 = new Thread(new Consumer(shop,2));
        Thread consumer3 = new Thread(new Consumer(shop,3));
        
        consumer1.start();
        consumer2.start();
        consumer3.start();
        /*for(int i = 0; i < 10; i++)
        {
            Runnable consumer = new Consumer(shop, i);
            executor.execute(consumer);
        }*/
        
    }
    
}
