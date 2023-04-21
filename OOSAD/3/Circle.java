public class Circle extends Shape 
{
    private int r;
    private double pi = 3.14;
    
    public Circle(int r) 
    {
        this.r = r;
    }

    void draw() 
    {
        System.out.println("\n*** The Circle is drawn here. ***\n");
    }

    double area()
    {
        return pi*r*r;
    }
}
