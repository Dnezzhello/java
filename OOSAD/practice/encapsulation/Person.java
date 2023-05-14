package practice.encapsulation;

public class Person {
    private double id;
    private String name;

    public Person()
    {
        //only person class can access and assign
        id = Math.random();
    }
}
