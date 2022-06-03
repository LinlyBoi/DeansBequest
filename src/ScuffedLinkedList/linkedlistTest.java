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
        assertEquals(50, L1.getNode(3).getValue());
        L1.add(30,1);
        assertEquals(30, L1.getNode(1).getValue());
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

    @Test
    void spin2()
    {
        linkedlist L1 = new linkedlist(50);
        L1.add(49,1);
        L1.add(48,1);
        L1.add(47,1);
        L1.add(46,1);
        L1.add(45,1);
        L1.add(44,1);
        L1.add(43,1);
        L1.add(42,1);
        L1.add(41,1);
        L1.add(40,1);
        L1.add(39,1);
        L1.add(38,1);
        L1.add(37,1);
        L1.spin2();

    }
    @Test
    void backwards()
    {
        linkedlist L1 = new linkedlist(50);
        L1.addLast(49);
        L1.addLast(48);
        L1.addLast(47);
        L1.addLast(46);
        L1.addLast(45);
        L1.backwards();

    }
}