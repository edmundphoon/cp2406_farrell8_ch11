package Q2;

public class PhoneCallArray
{
   public static void main(String[] args)
   {
      PhoneCall[] aCall = new PhoneCall[10];
      aCall[0] = new IncomingPhoneCall("(640) 556-0583");
      aCall[1] = new OutgoingPhoneCall("(901) 560-5418", 6);
      aCall[2] = new IncomingPhoneCall("(246) 966-7011");
      aCall[3] = new OutgoingPhoneCall("(667) 739-0737", 8);
      aCall[4] = new IncomingPhoneCall("(984) 502-2623");
      aCall[5] = new OutgoingPhoneCall("(383) 741-3575", 0.8);
      aCall[6] = new IncomingPhoneCall("+65-855-538-79");
      aCall[7] = new OutgoingPhoneCall("+61 491 570 110", 7);
      aCall[8] = new IncomingPhoneCall("011-81-90-1790-1357");
      aCall[7] = new OutgoingPhoneCall("06243 48 98 66", 4);
      for(int x = 0; x < aCall.length; ++x)
      {
         aCall[x].getInfo();
         System.out.println(" ");
      }
   }
}
