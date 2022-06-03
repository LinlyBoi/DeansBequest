package ScuffedLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonsaiTreeTest {

    @Test
    void add() {
        BonsaiTree T = new BonsaiTree();
        T.add(5);
        T.add(6);
        T.add(7);
        T.add(9);
        T.add(8);
        T.add(3);
        T.add(4);
        System.out.println(T.root.right.value);
        T.search(9);
        T.search(0);


    }
}