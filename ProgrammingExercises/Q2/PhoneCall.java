package Q2;

public abstract class PhoneCall
{
   String phoneNum = new String();
   double price;
   public PhoneCall(String pn)
   {
      phoneNum = pn;
      price = 0.00;
   }
   public void setPrice(double aPrice)
   {
      price = aPrice;
   }
   public abstract String getPhoneNum();
   public abstract double getPrice();
   public abstract void getInfo();
}