
package producerconsumer;
 
public class Raspberry implements Food{
    private String name;
    private int number;
    private int id;
    
    public Raspberry(int number, int id)
    {
        this.id = id;
        this.name = "Raspberry";
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
