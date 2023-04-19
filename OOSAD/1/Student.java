public class Student extends Person 
{
    private String major;

    public Student(String id, String n, String m)
    {
        super(id, n); 
        major = m;
    }

    public void display()
    {
        super.info();
        System.out.println("I'm a student majoring in " + major);
    }

}
