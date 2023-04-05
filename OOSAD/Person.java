public class Person 
{
    private String pID;
    private String pName;
    private String pTel;

    public Person(String id, String n) // Constructor
    {
        pID = id;
        pName = n;
    }

    public void setTel(String pTel)
    {
        this.pTel = pTel;
    }

    public String getTel()
    {
        return pTel;
    }

    public void info()
    {
        System.out.println("\n"+ pID + " >>> " + pName);
    }
}












































// public class Person {
//     private String pID;
//     private String pName;
//     //private double salary;

//     public void setID(String id) 
//     {
//         pID = id;
//     }

//     public void setName(String pName)
//     {
//         this.pName = pName;
//     }

//     public String getID()
//     {
//         return pID;
//     }

//     public String getName()
//     {
//         return pName;
//     }
// }


