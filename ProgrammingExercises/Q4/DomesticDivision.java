package Q4;

public class DomesticDivision extends Division {
   String state;
   public DomesticDivision(String title, int num, String locate) {
      super(title, num);
      state = locate;
   }
   public void display() {
      System.out.println("Domestic Division");
      System.out.println("--------------------");
      System.out.println("Title: " + companyDivisionName);
      System.out.println("Account no.: " + accountNum);
      System.out.println("State located: " + state);
   }
}
