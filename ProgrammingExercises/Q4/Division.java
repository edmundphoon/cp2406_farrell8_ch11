package Q4;

public abstract class Division {
   String companyDivisionName;
   int accountNum;

   public Division(String name, int num) {
      companyDivisionName = name;
      accountNum = num;
   }
   public abstract void display();
}