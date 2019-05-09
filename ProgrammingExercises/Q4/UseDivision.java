package Q4;

import java.util.Scanner;

public class UseDivision
{
   public static void main(String[] args)
   {
      String domDiv, intDiv;
      int domNum, intNum;
      String domState, intCountry;
      String intLang;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a name of domestic division: ");
      domDiv = in.nextLine();

      System.out.println("Enter the account number for the domestic division: ");
      domNum = in.nextInt();

      System.out.println("Enter the state for the domestic division: ");
      domState = in.nextLine();

      DomesticDivision domesticDiv = new DomesticDivision(domDiv, domNum, domState);

      System.out.println("Enter a name of an international division: ");
      intDiv = in.nextLine();

      System.out.println("Enter the account number for the international division: ");
      intNum = in.nextInt();

      System.out.println("Enter the country for the international division: ");
      intCountry = in.nextLine();

      System.out.println("Enter the language spoken for the international division: ");
      intLang = in.nextLine();

      InternationalDivision internationalDiv = new InternationalDivision(intDiv, intNum, intCountry, intLang);

      System.out.println(" ");
      domesticDiv.display();
      System.out.println(" ");
      internationalDiv.display();
   }
}
