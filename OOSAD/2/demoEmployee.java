public class demoEmployee {
    public static void main(String[] args)
    {
        Employee e = new Employee("Khamdee", 2000000, 2020);
        e.Data();
        System.out.println("Based salary = " + e.getSalary() + "\n");

        Manager m = new Manager("Khamlar", 2019);
        m.setBonus(600000);
        m.Data();
        System.out.println("Based salary = " + m.getSalary() + "\n");
    }
}
