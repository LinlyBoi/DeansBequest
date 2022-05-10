package ScuffedLinkedList;

import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class LetterQTest {

    public static LetterQ Quii = new LetterQ();
    @Test
    void enqueue() {
        Quii.enqueue(10);
        assertEquals(10,Quii.buffer[0]);

    }

    @Test
    void dequeue() {
        System.out.println(Quii);
        Quii.enqueue(1);
        Quii.enqueue(12);
        Quii.enqueue(123);
        Quii.enqueue(1234);
        Quii.enqueue(1245);
        System.out.println(Quii);
        Quii.dequeue();
        Quii.dequeue();
        Quii.dequeue();
        Quii.dequeue();
        Quii.dequeue();
        Quii.dequeue();
        System.out.println(Quii);
    }

    @Test
    void shift() {
        int[] test = {1,2,3,4,5,6};


    }
}