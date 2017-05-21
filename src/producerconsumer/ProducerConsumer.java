
package producerconsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(10); 
        Shop shop = new Shop();
        
        Runnable producer = new Producer(shop);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        
        for(int i = 0; i < 10; i++)
        {
            Runnable consumer = new Consumer(shop, i);
            executor.execute(consumer);
        }
        executor.shutdown();
        System.out.println("Zakonczono dzialanie programu");
    }
    
}
