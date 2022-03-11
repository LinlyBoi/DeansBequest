package Phonebook;


import java.util.LinkedList;
import java.util.Stack;

public class Phonebook
{
    public LinkedList<PhoneNumber> Numbers = new LinkedList<>();

    public boolean insert(String phoneNum, String name)
    {
        //check not start with 0 or 1
        if (phoneNum.charAt(0) == '0' || phoneNum.charAt(0) == '1')
            return false;

        if (phoneNum.length() == 10)
            return false;

        PhoneNumber[] listofNums = Numbers.toArray(new PhoneNumber[0]);
        for (int i = 0; i < listofNums.length; i++)
        {

            String check = listofNums[i].getNumber();
            if (phoneNum.equals(check))
                return false;
        }
        PhoneNumber toInsert = new PhoneNumber(phoneNum, name);
        Numbers.push(toInsert);

        return true;

    }

    public String getPhoneNumber(String name)
    {
        PhoneNumber[] listofNums = Numbers.toArray(new PhoneNumber[Numbers.size()]);
        for (int i = 0; i < listofNums.length; i++)
        {

            String check = listofNums[i].getName();
            if (name.equals(check))
                return listofNums[i].getNumber();
        }
        return null;
    }

    public String getName(String num)
    {
        PhoneNumber[] listofNums = Numbers.toArray(new PhoneNumber[Numbers.size()]);
        for (int i = 0; i < listofNums.length; i++)
        {

            String check = listofNums[i].getNumber();
            if (num.equals(check))
                return listofNums[i].getName();
        }
        return null;
    }
}

