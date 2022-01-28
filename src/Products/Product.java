package Products;


import java.util.Date;

public class Product
{
    String pname;
    double unitprice;
    Date expdate = new Date();

    Product()
    {

    }

    Product(String name, double price, Date date)
    {
        this.pname = name;
        this.unitprice = price;
        this.expdate = date;

    }

    public boolean checkExpired()
    {
        Date today = new Date();
        return expdate.before(today);
    }







    @Override
    public String toString()
    {
        return "Product name: " + pname + "\nUnit price: " + unitprice + "\nExpiration date: " + expdate;

    }






}
