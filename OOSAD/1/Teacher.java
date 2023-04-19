public class Teacher extends Person
{
    private String dept;
    private String subTeach;

    public Teacher(String id, String n, String dept, String subTeach)
    {
        super(id, n);
        this.dept = dept;
        this.subTeach = subTeach;
    }

    public void display()
    {
        super.info();
        System.out.println("I teach "+ subTeach + " in " + dept + " Department");
    }
}
