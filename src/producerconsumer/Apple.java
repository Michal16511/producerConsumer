
package producerconsumer;

public class Apple implements Food {
    private String name;
    private int number;
    
    public Apple(int number)
    {
        this.name = "Apple";
        this.number = number;
    }
    @Override
    public void getName()
    {
        System.out.println(" " + name + " numer: " + number);
    }
}
