
package producerconsumer;
 
public class Raspberry implements Food{
    private String name;
    private int number;
    
    public Raspberry(int number)
    {
        this.name = "Raspberry";
        this.number = number;
    }
    @Override
    public void getName()
    {
        System.out.println("Nazwa: " + name + " numer: " + number);
    }
}
