package Questionaire;

import java.util.Scanner;

public class Student
{


    public int[] ans = new int[25];


    public void answer()
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 25;)
        {
            int in = input.nextInt();
            if (in >= 1 && in <= 5)
            {
                ans[i] = in;
                i++;
            } else
                System.out.println("invalid answer");

        }

    }

}
