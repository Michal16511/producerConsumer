
package producerconsumer;

public class Banana implements Food{
    private String name;
    private int number;
    
    public Banana(int number)
    {
        this.name = "Banana";
        this.number = number;
    }
    @Override
    public void getName()
    {
        System.out.println("Nazwa: " + name + " numer: " + number);
    }
}
