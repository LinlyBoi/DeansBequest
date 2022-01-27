package Emploice;

import java.util.Random;

public class Programs
{
    public static void main(String[] args)
    {
        Employees[] employs = new Employees[100];

        for(int j = 0; j < employs.length; j++)
        {
            Random r = new Random();
            employs[j] = new Employees(r.nextInt(1,50));
        }
        for(int i = 0; i < employs.length; i++)
        {
         if(employs[i].getYears() >= 20)
             System.out.println(employs[i].toString());
        }


    }
}