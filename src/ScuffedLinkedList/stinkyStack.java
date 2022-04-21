package ScuffedLinkedList;

public class stinkyStack {
    node top;
    node head;


    public void push(int value)
    {
        if(head == null)
        {
            head = new node(value);
            top = head;
        }
        else
        {
            node inserted = new node(value);
            top.next = inserted;
            top = inserted;
        }



    }

    public void pop() {
        if (top == null)
            System.out.println("Stack underflow");
        else if (top == head) {
            System.out.println(head);
            head = null;
            top = null;
        } else {
            node pointer = head;
            System.out.println(top);
            while (pointer.next != top) {
                pointer = pointer.next;
            }
            pointer.next = null;
            top = pointer;
        }
    }

    public void display()
    {
        node pointer = head;
        while(pointer != null)
        {
            System.out.println(pointer);
            pointer = pointer.next;
        }

    }
}




