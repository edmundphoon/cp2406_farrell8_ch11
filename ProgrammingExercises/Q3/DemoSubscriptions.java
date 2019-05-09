package Q3;

import java.util.Scanner;

public class DemoSubscriptions
{
   public static void main(String[] args)
   {
      String physicalNews, onlineNews;
      String physicalName, onlineName;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a physical address: ");
      physicalNews = in.nextLine();
      System.out.println("Enter your name for the physical address: ");
      physicalName = in.nextLine();
      PhysicalNewspaperSubscription physicalAdd = new PhysicalNewspaperSubscription();
      physicalAdd.setName(physicalName);
      physicalAdd.setAddress(physicalNews);

      System.out.println("Enter an online address: ");
      onlineNews = in.nextLine();
      System.out.println("Enter your name for the online address: ");
      onlineName = in.nextLine();
      OnlineNewspaperSubscription onlineAdd = new OnlineNewspaperSubscription();
      onlineAdd.setName(onlineName);
      onlineAdd.setAddress(onlineNews);

      System.out.println("Physical Address:");
      System.out.println("------------------");
      System.out.println("Name: " + physicalAdd.getName());
      System.out.println("Address: " + physicalAdd.getAddress());
      System.out.println("Rate: " + physicalAdd.getRate());
      System.out.println(" ");
      System.out.println("Online Address:");
      System.out.println("------------------");
      System.out.println("Name: " + onlineAdd.getName());
      System.out.println("Address: " + onlineAdd.getAddress());
      System.out.println("Rate: " + onlineAdd.getRate());
   }
}
