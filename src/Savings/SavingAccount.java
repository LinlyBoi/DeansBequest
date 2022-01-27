package Savings;
public class SavingAccount
{
   static double interest_rate = 0.10;

   String id;
   double amount;
   SavingAccount(String Id,double Amount)
   {
       this.id = Id;
       this.amount = Amount;

   }

   public double calc_profit()
   {
       double profit = amount * interest_rate;
       amount+=profit;
       return profit;

   }
   public static double getInterest()
   {
       return interest_rate;

   }

   public double getAmount()
   {
       return amount;
   }

   public static void setInterest_rate(double newInt)
   {
       interest_rate = newInt;
   }


}
