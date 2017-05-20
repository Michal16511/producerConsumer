
package producerconsumer;

public class Apple implements Food {
    private String name;
    private int number;
    
    public Apple(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    @Override
    public void getName()
    {
        System.out.println("Nazwa: " + name + " numer: " + number);
    }
}
