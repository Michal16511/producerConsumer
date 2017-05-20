
package producerconsumer;
 
public class Raspberry implements Food{
    private String name;
    private int number;
    
    public Raspberry(String name, int number)
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
