package Emploice;

import java.util.Random;
import java.util.Arrays;

public class Programs
{
    public static void main(String[] args)
    {
        Employees Medhat = new Employees(20);
        Employees Hamada = Medhat;
        if(Medhat.getYears() == Hamada.getYears())
            System.out.println("El dof3a be yeso7o 3ala el fady");
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

        //System.out.println(Arrays.toString(employs));



    }
}