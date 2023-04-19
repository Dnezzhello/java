public class Staff extends Employee {

    private int OT;
    private double rate;

    public Staff(String n, double s, int h)
    {
        super(n, s, h);
    }

    public getSalary()
    {
        return super.getSalary + rate*OT;
    }
}
