package Q3;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
   public void setAddress(String addressInput)
   {
      boolean hasSign = false;
      address = addressInput;
      for(int x = 0; x < addressInput.length(); ++x) {
         if (addressInput.charAt(x) == '@') {
            hasSign = true;
         }
      }
      if (hasSign) {
         rate = 9;
      }
      else {
         rate = 0;
         System.out.println("Address does not have a sign. Please put in the sign '@'.");
      }
   }
}
