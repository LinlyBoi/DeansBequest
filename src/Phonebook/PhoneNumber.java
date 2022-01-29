package Phonebook;

public class PhoneNumber
{
    String name;
    String number;
    public String getNumber()
    {
        return number;
    }

    public String getName()
    {
    return name;
    }

    PhoneNumber(String num, String name)
    {
        this.number = num;
        this.name = name;
    }

}
