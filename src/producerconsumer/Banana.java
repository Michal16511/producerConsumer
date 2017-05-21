
package producerconsumer;

public class Banana implements Food{
    private String name;
    private int number;
    private int id;
    public Banana(int number, int id)
    {
        this.id = id;
        this.name = "Banana";
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
