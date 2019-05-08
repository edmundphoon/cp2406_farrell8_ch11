package Q2;

public class OutgoingPhoneCall extends PhoneCall
{
   public final static double RATE = 0.04;
   public double minutes;

   public OutgoingPhoneCall(String num, double min)
   {
      super(num);
      minutes = min;
      price = RATE * minutes;
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
   public double getTime()
   {
      return minutes;
   }
   public void getInfo()
   {
      System.out.println("Outgoing Phone Call");
      System.out.println("--------------------");
      System.out.println("Number: " + getPhoneNum());
      System.out.println("Rate: " + getPhoneNum() + " per min");
      System.out.println("Price: $" + getPrice());
      System.out.println("Time (in min): " + getTime() + " mins");
   }
}
