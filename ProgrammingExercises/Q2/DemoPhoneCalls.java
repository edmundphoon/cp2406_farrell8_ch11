package Q2;

import java.util.Scanner;

public class DemoPhoneCalls
{
   public static void main(String[] args)
   {
      String inputCall, outputCall;
      double outputMin;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter an incoming phone number: ");
      inputCall = in.nextLine();
      IncomingPhoneCall inCall = new IncomingPhoneCall(inputCall);

      System.out.println("Enter an outgoing phone number: ");
      outputCall = in.nextLine();
      System.out.println("Enter the number of minutes for the outgoing phone call: ");
      outputMin = in.nextDouble();
      OutgoingPhoneCall outCall = new OutgoingPhoneCall(outputCall, outputMin);

      System.out.println(" ");
      inCall.getInfo();
      System.out.println(" ");
      outCall.getInfo();
   }
}
