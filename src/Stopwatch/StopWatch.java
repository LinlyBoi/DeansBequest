package Stopwatch;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class StopWatch
{
    private LocalTime startTime,endTime;
    public StopWatch()
    {
        startTime=LocalTime.of(0,0,0);
        endTime= LocalTime.of(0,0,0);
    }
    public LocalTime getStartTime()
    {
        return startTime;
    }
    public LocalTime getEndTime()
    {
        return endTime;
    }
    public LocalTime start()
    {
       return startTime=LocalTime.now();
    }
    public LocalTime stop()
    {
        return endTime=LocalTime.now();
    }
    public Long getElapsedTime()
    {
        Long milliesbetween= ChronoUnit.MILLIS.between(startTime,endTime);
        return (milliesbetween);
    }

}
