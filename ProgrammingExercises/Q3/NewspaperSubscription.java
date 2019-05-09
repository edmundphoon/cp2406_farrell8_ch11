package Q3;

public abstract class NewspaperSubscription {
   String name;
   String address;
   int rate;
   public String getName() {
      return name;
   }
   public void setName(String n) {
      name = n;
   }
   public String getAddress() {
      return address;
   }
   public double getRate() {
      return rate;
   }
   public abstract void setAddress(String s);
}