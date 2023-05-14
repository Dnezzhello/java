public class Composition {
    public static void main(String[] args)
    {
        Address address1 = new Address("Dongdok", "Xaythany");
        Student student1 = new Student("Souphaxay Naovalath", 22, 4.0, 110, address1);

        System.out.println(student1);
        System.out.println(address1);
    }
}
