package ScuffedLinkedList;

public class linkedlist
{
    public node head;
    public node tail;
    public int size;

    linkedlist()
    {
        size = 0;

    }

    linkedlist(int value)
    {
        node inserted = new node(value);
        this.head = inserted;
        this.tail = inserted;
        head.prev = tail;
        tail.next = head;
        size = 1;

    }


    public node getNode(int index)
    {

        if (index == 0) return head;

        else if (index == size - 1) return tail;


        else
        {
            node current = head;
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }
            return current;

        }
    }




    public void add(int value, int index)
    {
        if (index == 0)
        {
            addFirst(value);
        } else if (index == size)
        {
            addLast(value);

        } else
        {

            node inserted = new node(value);
            node target = getNode(index);
            target.prev.next = inserted;
            inserted.prev = target.prev;
            inserted.next = target;
            target.prev = inserted;



            size++;
        }
    }

    public void addLast(int value)
    {

        node inserted = new node(value);

        tail.next = inserted;
        inserted.prev = tail;
        inserted.next = head;
        tail = inserted;
        head.prev = tail;
        tail.next = head;
        size++;
    }

    public void addFirst(int value)
    {
        node target = head;
        node inserted = new node(value);

        target.prev = inserted;
        inserted.prev = tail;
        inserted.next = target;
        head = inserted;
        head.prev = tail;
        tail.next = head;
        size++;
    }


    public void delete(int index)
    {
        node target = getNode(index);
        node prev, next;

        prev = target.prev;
        next = target.next;

        if (prev == tail) head = next;

        else if (next == head) tail = prev;

        else
        {
            prev.next = next;
            next.prev = prev;
        }
        size--;
    }

    public void spin2()
    {
        int count = 0;
        while (count != 2)
        {
            node temp = head;
            while (temp.next != head)
            {
                System.out.print(temp + " ");
                temp = temp.next;
            }
            count++;
        }
    }

    public void backwards()
    {
        int count = 0;
        while (count != 2)
        {
            node temp = tail;
            while (temp.prev != tail)
            {
                System.out.print(temp + " ");
                temp = temp.prev;
            }
            count++;
        }
    }
    // Get factorial of number

}
