package Phonebook;

public class YellowPages extends Phonebook
{
    public int TotalNumbers()
    {
        return Numbers.size();
    }
    public double percentage810()
    {
        double percentage;
        double total = 0;
        PhoneNumber[] listofNums = Numbers.toArray(new PhoneNumber[Numbers.size()]);
        for (int i = 0; i < listofNums.length; i++)
        {
            String check = listofNums[i].getNumber();
            if (check.startsWith("810"))
                total++;
        }
        double size = Numbers.size();
        percentage = 100*total/size;

        return percentage;
    }



}
