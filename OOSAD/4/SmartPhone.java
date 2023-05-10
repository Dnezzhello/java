public class SmartPhone implements IPhone, ICamera
{
    String phoneNumber;
    String sms;

    public void call(String phoneNumber)
    {
        System.out.println("Calling to ... " + phoneNumber);
    }

    public void sendSMS(String phoneNumber, String sms)
    {
        System.out.println("Send sms to " + phoneNumber + "\nMessage: " + sms);
    }

    public void takePhoto()
    {

    }

    public void deletedPhoto()
    {

    }
}
