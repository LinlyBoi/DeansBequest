package ScuffedLinkedList;

import java.util.Scanner;
import java.util.Stack;

public class sheet1DS
{
  public static String Grade(int score)
  {
    if(score >= 90)
      return "A";
    else if(score >= 80)
      return "B";
    else if(score >= 70)
      return "C";
    else if(score >= 60)
      return "D";
    else
      return "F";
  }
  public static int factorial(int n)
  {

    if(n > 2)
    return n * factorial(n-1); 
    else
      return 1;
  }
  public static void PassOrFail(int n)
  {
    int entered = 0,current,fail = 0,fullmark = 0;
    Scanner input = new Scanner(System.in);
    Stack<Integer> Students = new Stack<>();
    while(entered <= n)
    {
      Students.push(input.nextInt());
      entered++;
    }
    input.close();
    while(!Students.isEmpty())
    { 
      current = Students.pop();
      if(current < 50)
        fail++;
      if(current == 100)
        fullmark++;
    }
    System.out.println("Failed " + fail);
    System.out.println("Full Mark " + fullmark);

  }

  public static void main(String[] args)
  {
    System.out.println(factorial(4));
    System.out.print(Grade(91));
    PassOrFail(10);
  }


}
