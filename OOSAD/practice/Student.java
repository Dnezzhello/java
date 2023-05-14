package practice;

public class Student {
    private String name;
    private String college;

    // constructor
    public Student(String name, String college)
    {
        super();
        this.name = name;
        this.college = college;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCollege()
    {
        return college;
    }

    public void setCollege(String college)
    {
        this.college = college;
    }

    public static void main(String[] args)
    {
        Student student1 = new Student("Remesh", "BVB");
        Student student2 = new Student("Prakash", "GEH");
        Student student3 = new Student("Pramod", "IIT");

        System.out.println("First student's name is " + student1.name + " who is studying at " + student1.college);
    }
}
