
package producerconsumer;

public class Apple implements Food {
    private String name;
    private int number;
    private int id;
    public Apple(int number, int id)
    {
        this.id = id;
        this.name = "Apple";
        this.number = number;
    }
    
    @Override
    public int getId()
    {
        return id;
    }
    
    @Override
    public void getName()
    {
        System.out.println(" nazwa: " + name + " numer: " + number);
    }
}
