package Q1;

public class BookArray
{
   public static void main(String[] args)
   {
      Book[] aBook = new Book[10];
      aBook[0] = new Fiction("The Hobbit");
      aBook[1] = new NonFiction("Silent Spring");
      aBook[2] = new Fiction("Jane Eyre");
      aBook[3] = new NonFiction("Student Workbook Java in a Nutshell");
      aBook[4] = new Fiction("The Lion, The Witch and The Wardrobe");
      aBook[5] = new NonFiction("Digiatl Nature Photography");
      aBook[6] = new Fiction("The Fault in Our Stars");
      aBook[7] = new NonFiction("The Princeton Field Guide to Dinosaurs");
      aBook[8] = new Fiction("Animal Farm");
      aBook[7] = new NonFiction("Lonely Planet: Australia");
      for(int x = 0; x < aBook.length; ++x)
      {
         System.out.println("The book " + (aBook[x].getTitle()) + " costs $" + (aBook[x].getPrice()) + ".");
      }
   }
}
