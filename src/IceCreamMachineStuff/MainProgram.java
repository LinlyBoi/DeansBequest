package IceCreamMachineStuff;

public class MainProgram
{
    public static void main(String[] args)
    {
        ChocolateIceCreamMachine ChoccyGenerator = new ChocolateIceCreamMachine(10,5,3);
        ChoccyGenerator.addMaterial(50,25,15);
        ChoccyGenerator.make(4);
        System.out.println("Amount in machine: " + ChoccyGenerator.pack());
        System.out.println(ChoccyGenerator.toString());

    }

}
