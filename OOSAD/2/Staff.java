public class Staff extends Employee {

    private int OT;

    public Staff(String n, double s, int h, int OT)
    {
        super(n, s, h);
        this.OT = OT;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + OT;
    }
}
