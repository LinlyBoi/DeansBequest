package IceCreamMachineStuff;

public class ChocolateIceCreamMachine extends IceCreamMachine
{
    private double Cocoa;
    private double CocoaConsumption;
    public ChocolateIceCreamMachine(double creamconsumption,double sugarconsumption, double cocoaconsumption)
    {
        this.CocoaConsumption = cocoaconsumption;
        this.SugarConsumption = sugarconsumption;
        this.CreamConsumption = creamconsumption;
    }

    public void addMaterial(double cream,double sugar,double coca)
    {
        Cream += cream;
        Sugar += sugar;
        Cocoa += coca;

    }

    public double make(double amount)
    {
        double made = 0;
        while(made < amount && Sugar >= SugarConsumption && Cream >= CreamConsumption && Cocoa >= CocoaConsumption)
        {
            made++;
            Sugar -= SugarConsumption;
            Cream -= CreamConsumption;
            Cocoa -= CocoaConsumption;

        }
        Icecream += made;
        return made;
    }

    @Override
    public String toString()
    {
        return "No. of Cream: " + Cream + "\nNo. of IceCream: " + Icecream + "\n No. of sugar: " + Sugar + "\nNo. of Cocoa: " + Cocoa;
    }



}
