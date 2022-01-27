package Savings;
public class SavingForm
{
    public static void main(String[] args)
    {
        SavingAccount a1 = new SavingAccount("123asjkljr",500);

        System.out.println("Balance is : "+ a1.getAmount() + " BEFORE profit");

        double a1profit = a1.calc_profit();

        System.out.println("Profit is : "+a1profit);
        System.out.println("Balance is : "+a1.getAmount());

    }
}
