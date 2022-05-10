package ScuffedLinkedList;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class LetterQ
{
    int rear,front;
    public int[] buffer;
    LetterQ()
    {
       this(10);
    }
    LetterQ(int size)
    {
         buffer = new int[size];
        rear = -1;
        front = 0;
    }
    public void enqueue(int value)
    {
        if(rear < buffer.length)
            buffer[++rear] = value;
        else
            System.out.println("Queue full!");

    }
    public int dequeue()
    {
        if(rear == -1) {
            System.out.println("Queue Empty!");
            buffer = new int[buffer.length];
        }
        else
        {
            System.out.println(buffer[0]);
            buffer[0] = 0;
            shift();
            rear--;

        }
        return buffer[0];
    }

    public void shift() {
        Stack<Integer> temp = new Stack<>();
        for (int i = buffer.length-1; i > -1; i--)
        {
            if (buffer[i] != 0)
                temp.push(buffer[i]);

        }
        for (int i = 0; i < buffer.length ; i++)
            if(!temp.isEmpty())
                buffer[i] = temp.pop();
            else
                break;


    }

    public static Queue SearchNDestroy(Queue<Integer> container, int target)
    {
        int temp;
        Stack<Integer> buffer = new Stack<>();
        while(!container.isEmpty())
        {
            temp = container.poll();
            if(temp != 0 && temp != target) {
                buffer.push(temp);
            }

        }
        while(!buffer.isEmpty())
            container.offer(buffer.pop());

        return container;

        }



    @Override
    public String toString()
    {
        return Arrays.toString(buffer);
    }

}



