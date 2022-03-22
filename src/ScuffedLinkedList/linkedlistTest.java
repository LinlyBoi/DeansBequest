package ScuffedLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linkedlistTest
{

    @Test
    void getNode()
    {
        linkedlist L1 = new linkedlist(50);

        L1.add(49,0);
        assertEquals(2,L1.size);
        assertEquals(50, L1.getNode(2).getValue());
        L1.add(30,1);
        assertEquals(30, L1.getNode(2).getValue());
    }


    @Test
    void delete()
    {
        linkedlist L2 = new linkedlist(10);
        L2.addFirst(20);
        L2.addFirst(30);
       assertEquals(10, L2.tail.getValue());
       assertEquals(30, L2.head.getValue());
       L2.delete(L2.size);

    }
}