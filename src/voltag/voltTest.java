package voltag;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class voltTest
{

    @org.junit.Test
    public void calc_mean()
    {
        Random r = new Random();
        double[] feb = new double[72];
        Arrays.fill(feb, 100);
        volt v1 = new volt(feb);
        v1.calc_mean();
        double mean = v1.getMean();

        assertEquals(100,v1.getMean(),0);
    }



    @org.junit.Test
    public void report()
    {
        Random r = new Random();

        double[] hours = new double[72];
        for(int i = 0; i < hours.length; i++)
            hours[i] = r.nextInt(50,80);

        volt v1 = new volt(hours);
       v1.setMean(10);
        System.out.println(v1.report());

    }
}