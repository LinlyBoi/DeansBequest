package ScuffedLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stinkyStackTest {

    @Test
    void push()
    {
        stinkyStack stack = new stinkyStack();
        stack.push(50);
        assertEquals(50, stack.head.getValue());
        assertEquals(50, stack.top.getValue());
        stack.push(40);
        assertEquals(50, stack.head.getValue());
        assertEquals(40,stack.top.getValue());
    }

    @Test
    void pop() {
        stinkyStack stack = new stinkyStack();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
    @Test
    void display()
    {
        stinkyStack stack = new stinkyStack();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.display();

    }
}