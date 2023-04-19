public class DemoPerson {
    public static void main(String[] args) {

        Student s = new Student("S1", "Souphaxay", "Computer Science");
        s.setTel("54248585");
        s.display();
        System.out.println("My phone number is " + s.getTel());

        Teacher t = new Teacher("T1", "Sommany", "CS", "OOSAD");
        t.display();
    }
}
