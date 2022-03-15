package ScuffedLinkedList;

public class linkedlist
{
    private node head;
    private node tail;
    private int size;

    linkedlist(int value)
    {
        this.head = new node(value);
    }

    public void add(int value, int index)
    {
        node inserted = new node(value);
        if(index == 0)
        {
            if(head.next == null)
            {

            }
            else
            {
                inserted.next = head;
                head.prev = inserted;
            }

        }
        else if(index <= size)
        {
            if(index < size/2)
            {
                int counter = 0;
                node previous = head;
                node current = previous.prev;

                while (counter < index - 1) {
                    counter++;
                    current = current.next;
                    previous = previous.next;

                }
                inserted.next = current;
                inserted.prev = previous;

                current.prev = inserted;
                previous.next = inserted;
                size++;
            }
            else
            {

                int counter = size;
                node previous = tail;
                node current = previous.prev;

                while (counter > index) {
                    counter--;
                    current = current.prev;
                    previous = previous.prev;

                }
                inserted.next = current;
                inserted.prev = previous;

                current.prev = inserted;
                previous.next = inserted;
            }

        }
        else if(index >= size)
        {
            inserted.prev = tail;
            tail.next = inserted;
            tail = inserted;
        }
        size++;
    }
}
