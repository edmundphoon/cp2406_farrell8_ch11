package Q4;

public class InternationalDivision extends Division {
   String country;
   String languageSpoken;
   public InternationalDivision (String title, int num, String locate, String speak) {
      super(title, num);
      country = locate;
      languageSpoken = speak;
   }
   public void display() {
      System.out.println("International Division");
      System.out.println("--------------------");
      System.out.println("Title: " + companyDivisionName);
      System.out.println("Account no.: " + accountNum);
      System.out.println("Country: " + country);
      System.out.println("Language: " + languageSpoken + "\n");
   }
}
