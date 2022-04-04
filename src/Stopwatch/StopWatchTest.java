package Stopwatch;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class StopWatchTest
{

    @Test
    public void getElapsedTime() throws InterruptedException
    {
       StopWatch Watch1 = new StopWatch();
       StopWatch Watch2 = new StopWatch();
       StopWatch Watch3 = new StopWatch();
       StopWatch Watch4 = new StopWatch();
//        Watch1.start();
//        try
//        {
//            TimeUnit.MINUTES.sleep(1);
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//        Watch1.stop();

        Watch2.start();
        TimeUnit.MILLISECONDS.sleep(69);
        Watch2.stop();

        Watch3.start();
        TimeUnit.MILLISECONDS.sleep(10);
        Watch3.stop();

        Watch4.start();
        TimeUnit.MILLISECONDS.sleep(12);
        Watch4.start();
        TimeUnit.MILLISECONDS.sleep(69);
        Watch4.stop();



//        assertEquals(60000, Watch1.getElapsedTime(), 10);
        assertEquals(69, Watch2.getElapsedTime(),10);
        assertEquals(10, Watch3.getElapsedTime(),10);
        assertEquals(69, Watch4.getElapsedTime(),10);


    }
}