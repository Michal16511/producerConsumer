
package producerconsumer;

public class Banana implements Food{
    private String name;
    private int number;
    
    public Banana(String name, int number)
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
