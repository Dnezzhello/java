public class Showchoir implements Dancer, Singer
{
    public void sing(String song, String byWho)
    {
        System.out.println("A song I can sing is " + song + " by " + byWho);
    }

    public void dance(String type)
    {
        System.out.println("My dance type is " + type);
    }
}