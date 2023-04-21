public class DemoPolymorphism {
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle(5.5, 7);
        rectangle.draw();
        System.out.println("The area of the rectangle is " + rectangle.area());

        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("The area of the circle is " + circle.area());
    }
}
