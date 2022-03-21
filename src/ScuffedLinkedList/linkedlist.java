package ScuffedLinkedList;

public class linkedlist
{
    public node head;
    public node tail;
    public int size;

    linkedlist()
    {

    }

    linkedlist(int value)
    {
        node inserted =new node(value);
        this.head = inserted;
        this.tail = inserted;
    }


    public node getNode(int index)
    {

        if(index == 0)
            return head;

        else if(index == size)
            return tail;


        else if(index > size/2 && size > 10)
        {
            node current = tail;
            for(int count = size; count > index-2; count--)
                current = current.prev;
            return current;
        }

        else if(index <= size/2 || size < 10)
        {
            node current = head;
            for(int count = 0; count < index-2; count++)
                current = current.next;
            return current;
        }
        else
            return null;
    }


    public void add(int value, int index)
    {
        if(index == 0)
        {
            addFirst(value);
        }
        else if(index == size)
        {
            addLast(value);
        }
        else
        {
            node inserted = new node(value);
            node target = getNode(index);

            inserted.next = target.next;
            inserted.prev = target;
            target.next = inserted;
        }
        size++;
    }

    public void addLast(int value)
    {
        node target = tail;
        node inserted = new node(value);

        target.next = inserted;
        inserted.prev = target;
        tail = inserted;
        size++;
    }

    public void addFirst(int value)
    {
        node target = head;
        node inserted = new node(value);

        target.prev = inserted;
        inserted.next = target;
        head = inserted;
        size++;
    }


    public void delete(int index)
    {
       node target = getNode(index);
       node prev,next;

       prev = target.prev;
       next = target.next;

        if(prev == null)
            head = next;

        else if(next == null)
            tail = prev;

        else
        {
            prev.next = next;
            next.prev = prev;
        }
       size--;
    }
}
