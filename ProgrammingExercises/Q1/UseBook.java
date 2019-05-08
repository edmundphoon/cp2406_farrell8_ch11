package Q1;

import java.util.Scanner;

public class UseBook
{
   public static void main(String[] args)
   {
      String fictionalTitle, nonFictionalTitle;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a fictional book title: ");
      fictionalTitle = in.nextLine();
      Fiction aFictionBook = new Fiction(fictionalTitle);

      System.out.println("Enter a non-fictional book title: ");
      nonFictionalTitle = in.nextLine();
      NonFiction aNonFictionBook = new NonFiction(nonFictionalTitle);

      System.out.println("The fiction book " + (aFictionBook.getTitle()) + " costs $" + (aFictionBook.getPrice()) + ".");
      System.out.println("The non-fiction book " + (aNonFictionBook.getTitle()) + " costs $" + (aNonFictionBook.getPrice()) + ".");
   }
}
