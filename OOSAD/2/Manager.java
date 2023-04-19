public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int h)
    {
        super(n, s, h);
    }

    public void setBonus(double b)
    {
        b = bonus;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
