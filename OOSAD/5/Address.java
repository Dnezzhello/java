public class Address 
{
    private String village, city;

    public Address(String village, String city)
    {
        this.village = village;
        this.city = city;
    }

    public String toString()
    {
        return "Village :: " + village + "\nCity :: " + city;
    }
    
}
