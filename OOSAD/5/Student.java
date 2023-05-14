public class Student extends Person 
{
    private double grade;
    private int rollNo;
    private Address address;

    public Student(String name, int age, double grade, int rollNo, Address address)
    {
        super(name, age);
        this.grade = grade;
        this.rollNo = rollNo;
        this.address = address;
    }
}
