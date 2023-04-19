public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int h)
    {
        super(n, s, h);
    }

    public Manager(double s)
    {
        super(s);
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
