package ScuffedLinkedList;

public class linkedlist {
    public node head;
    public node tail;
    public int size;

<<<<<<< HEAD
    linkedlist()
    {
        size = 0;
=======
    linkedlist() {
        size = -1;

>>>>>>> aae40d7982df045ed4b77fc7a23e6e6ebb893eb7
    }

    linkedlist(int value) {
        node inserted = new node(value);
        this.head = inserted;
        this.tail = inserted;
<<<<<<< HEAD
        size = 1;
=======
        head.prev = tail;
        tail.next = head;

        size = 0;
>>>>>>> aae40d7982df045ed4b77fc7a23e6e6ebb893eb7
    }


    public node getNode(int index) {

        if (index == 0)
            return head;

<<<<<<< HEAD
        else if(index == size-1)
            return tail;


        else if(index > size/2)
        {
            node current = tail;
            for(int count = size-1; count > index; count--)
                current = current.prev;
            return current;
        }

        else if(index <= size/2)
        {
=======
        else if (index == size)
            return tail;


         else
         {
>>>>>>> aae40d7982df045ed4b77fc7a23e6e6ebb893eb7
            node current = head;
            for (int count = 0; count < index-1; count++)
                current = current.next;
            return current;
        }
    }


    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);

        }
        else {

            node inserted = new node(value);
            node target = getNode(index);

            inserted.next = target.next;
            inserted.prev = target;
            target.next = inserted;
        }
        size++;
    }

    public void addLast(int value) {

        node inserted = new node(value);

        tail.next = inserted;
        inserted.prev = tail;
        inserted.next = head;
        tail = inserted;
        head.prev = tail;
        tail.next = head;
        size++;
    }

    public void addFirst(int value) {
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


    public void delete(int index) {
        node target = getNode(index);
        node prev, next;

        prev = target.prev;
        next = target.next;

        if (prev == tail)
            head = next;

        else if (next == head)
            tail = prev;

        else {
            prev.next = next;
            next.prev = prev;
        }
        size--;
    }

    public void spin2()
    {
        int count = 0;
        while(count != 2)
        {
            node temp = head;
            while(temp.next != head)
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
        while(count != 2)
        {
            node temp = tail;
            while(temp.prev != tail)
            {
                System.out.print(temp + " ");
                temp = temp.prev;
            }
            count++;
        }
    }
    // Get factorial of number

}
