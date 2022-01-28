package voltag;

import java.util.Arrays;

public class volt
{
    double[] voltage = new double[72];
    double mean;

    public volt(){}

    public volt(double[] Voltage)
    {
        this.voltage=Voltage;
    }

    public double calc_mean()
    {
        double avg=0;
        for (int i=0;i<voltage.length;i++)
        {
            avg+=voltage[i];
        }
        mean = avg/72;

        return getMean();
    }

    public double getMean()
    {
        return mean;
    }
    public void setMean(double newmean)
    {
        mean = newmean;
    }

    public String report()
    {
        //hours more than mean by 10%
        double[] hours10 = new double[72];
        double bigger = 1.10 * mean;
        double smaller = 0.90 * mean;
        int count = 0;
        for(int i = 0; i < voltage.length; i++)
        {

            if(voltage[i] > bigger || voltage[i] < smaller )
            {
                hours10[count] = voltage[i];
                count++;
            }

        }
        //from one to another by 15%
        double[] hours15 = new double[72];
        int count2 = 0;
        while(count2 < 71)
        {
           for(int j = 0; j < voltage.length; j++)
           {
               int limit = voltage.length - 2;
               if(j <= limit)
               {
                   double change = Math.abs(voltage[j] - voltage[j + 1]);
                   if(change > mean * 1.15)
                   {
                       hours15[j] = voltage[j];
                       hours15[j+1] = voltage[j+1];

                   }
               }

           }
           count2++;
        }

        return "The hours more  than 10% of mean are: " + Arrays.toString(hours10) + "\nAdjacent hours of voltage difference more than  15% of mean are: " + Arrays.toString(hours15);


    }
}
