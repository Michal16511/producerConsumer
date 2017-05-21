
package producerconsumer;

import java.util.Random;

public class Factory {
    private String[] food = {"Apple", "Raspberry", "Banana"};
    private int index = 0;
    private int appleCounter = 0;
    private int bananaCounter = 0;
    private int raspberryCounter = 0;
    private int id = 0;
    Random generator = new Random();
    
    public Food getFood()
    {
        id++;
        this.index = generator.nextInt(3);
    
        if(food[index].equalsIgnoreCase("Apple"))
        {
            this.appleCounter++;
            return new Apple(appleCounter, id);
            
        }else if(food[index].equalsIgnoreCase("Banana"))
        {
            this.bananaCounter++;
            return new Banana(bananaCounter, id);
        
        }else if(food[index].equalsIgnoreCase("Raspberry"))
        {
            raspberryCounter++;
            return new Raspberry(raspberryCounter, id);
        }
        return null;
    }
}
