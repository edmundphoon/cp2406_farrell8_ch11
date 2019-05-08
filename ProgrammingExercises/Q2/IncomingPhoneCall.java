package Q2;

public class IncomingPhoneCall extends PhoneCall
{
   public final static double RATE = 0.02;

   public IncomingPhoneCall(String num)
   {
      super(num);
      price = RATE;
   }
   // Constructor passing phone number parameter to parent's constructor
   public String getPhoneNum()
   {
      return phoneNum;
   }
   public double getPrice()
   {
      return price;
   }
   public void getInfo()
   {
      System.out.println("Incoming Phone Call");
      System.out.println("--------------------");
      System.out.println("Number: " + getPhoneNum());
      System.out.println("Rate: " + getPhoneNum() + " per call");
      System.out.println("Price: $" + getPrice());
   }
}
