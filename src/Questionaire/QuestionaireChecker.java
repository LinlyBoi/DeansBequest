package Questionaire;

import java.util.Scanner;

public class QuestionaireChecker
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of students:");
        int numberOfStudents = input.nextInt();

        Student[] students = new Student[numberOfStudents];

        for(int i = 0; i < students.length;i++)
        {
            System.out.println("enter answers for student " + (i+1));
            students[i] = new Student();
            students[i].answer();
            System.out.println("Answers for student " + (i+1) + " filled");
        }
        int[] sameAnswers = checkanswers(students);

        for(int k = 0; k < sameAnswers.length;k++)
        {
            if(sameAnswers[k] != 0)
            System.out.println(sameAnswers[k]);
        }


    }

    public static int[] checkanswers(Student[] students)
    {
        int[] questions = new int[25];
       for(int i = 0; i < 25; i++)
       {
           boolean same = true;
           int ans1 = students[0].ans[i];
                   for(int j = 1; j < students.length; j++)
                   {
                       if(ans1 != students[j].ans[i])
                           same = false;
                   }
                   if(same == true)
                       questions[i] = i+1;

       }
       return questions;

    }


}
