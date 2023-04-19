public class Staff extends Employee {

    private int OT;
    private double OTRate;

    public Staff(String n, double s, int h, int OT, double rate)
    {
        super(n, s, h);
        this.OT = OT;
        OTRate = rate;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + OT*OTRate;
    }
}
