public class Staff extends Employee {

    private int OT;
    private double OTRate;

    public Staff(String n, double s, int h, int OT, double OTRate)
    {
        super(n, s, h);
        this.OT = OT;
        this.OTRate = OTRate;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + OT*OTRate;
    }
}
