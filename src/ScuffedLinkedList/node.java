package ScuffedLinkedList;

public class node
{
    int data;
    public node next;
    public node prev;
    
    node(int data)
    {
        this.data = data;
    }
    
    node()
    {
        
    }
    public void setData(int data)
    {
        this.data = data;
    }
    


    public int getValue()
    {
        return data;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.data);
    }
    
    

}
