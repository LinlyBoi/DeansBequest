package coffee;

import java.util.Date;
import java.util.Stack;

public class Coffee extends Batch {
    String name;
    double price;
    int stock;
    Stack<Date> sold_records = new Stack<Date>();

    Coffee() {

    }

    Coffee(String n, double p, int s) {
        this.name = n;
        this.price = p;
        this.stock = s;
    }

    public void changePrice(double newprice) {
        price = newprice;
    }

    public void prepare(int num) {
        stock += num;
    }

    public void addStock(Batch batch,int amt)
    {
        prepare(batch.addBatch(amt));
    }

    public void sell(int num)
    {
        stock-=num;
        sold_records.push(new Date());
    }


    @Override
    public String toString()
    {
        return "Name: " + name + "\nPrice: " + price + "\nStock: "+ stock;
    }

}
