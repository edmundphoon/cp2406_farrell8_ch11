package Q3;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
   public void setAddress(String addressInput)
   {
      boolean hasDigit = false;
      address = addressInput;
      for(int x = 0; x < addressInput.length(); ++x) {
         if (Character.isDigit(addressInput.charAt(x))) {
            hasDigit = true;
         }
      }
      if (hasDigit) {
         rate = 15;
      }
      else {
         rate = 0;
         System.out.println("Address does not have a digit. Please put in a digit.");
      }
   }
}
