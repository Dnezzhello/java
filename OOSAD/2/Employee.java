public class Employee {

    private String eName;
    private double salary;
    private int hireYear;


    public Employee(String n, double s, int h) 
    {
        eName = n;
        salary = s;
        hireYear = h;
    }

    public void Data()
    {
        System.out.println("Employee's Name :: " + eName);
        System.out.println(eName + " has worked at this company since " + hireYear);
    }

    public double getSalary()
    {
        return salary;
    }
}
