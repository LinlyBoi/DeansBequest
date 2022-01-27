package coffee;

public class Batch
{
    int amount;
    double price;


    public int addBatch(int Takenout)
    {

        if(Takenout >= amount)
            return amount;
        if(amount == 0)
            return 0;
       amount-=Takenout;
       return Takenout;
    }
//ge4ta

    public int getAmount()
    {
        return amount;
    }


    public int available()
    {
        return amount;
    }




    @Override
    public String toString()
    {
        return "Amount in batch: " + amount + "\nTotal Price: " + price;
    }



}
