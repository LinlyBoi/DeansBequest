package IceCreamMachineStuff;

public class IceCreamMachine
{
    double Cream;
    double Sugar;
    double Icecream;
    double SugarConsumption;
    double CreamConsumption;
    IceCreamMachine()
    {

    }
    IceCreamMachine(double creamConsumption,double sugarConsumption)
    {
        this.CreamConsumption = creamConsumption;
        this.SugarConsumption = sugarConsumption;
    }
    public void addMaterial(double cream,double sugar)
    {
        Sugar+=sugar;
        Cream+=cream;
    }

    public double howMuch()
    {
        double C = Cream;
        double S = Sugar;
        double amount = 0;
        while(C >= CreamConsumption && S >= SugarConsumption)
        {

            amount +=1;
            C -= CreamConsumption;
            S -= SugarConsumption;
        }
        return amount;
    }
    public double make(double amount)
    {
        double made = 0;
        while(made < amount && Sugar >= SugarConsumption && Cream >= CreamConsumption)
        {
            made++;
            Sugar -= SugarConsumption;
            Cream -= CreamConsumption;

        }
        Icecream += made;
        return made;
    }
    public double pack()
    {
        double packs = Math.rint(Icecream);
        return packs;
    }
    @Override
    public String toString()
    {
        return "No. of Cream: " + Cream + "\nNo. of IceCream: " + Icecream + "\n No. of sugar: " + Sugar;
    }
}
