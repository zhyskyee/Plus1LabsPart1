package com.example.backendtime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@RestController
@CrossOrigin(allowCredentials = "true",origins = "*")
public class TimeService {

    @GetMapping("/api/time")
    public TimeModel getCurrentTime(){
        TimeModel currentTime =new TimeModel();
        Calendar c = new GregorianCalendar();
        TimeZone tz = TimeZone.getTimeZone("US/Central");
        c.setTimeZone(tz);
        currentTime.setHours(c.get(Calendar.HOUR_OF_DAY));
        currentTime.setMins(c.get(Calendar.MINUTE));
        currentTime.setSecs(c.get(Calendar.SECOND));
        currentTime.setMonth(c.get(Calendar.MONTH));
        currentTime.setDay(c.get(Calendar.DAY_OF_MONTH));
        currentTime.setYear(c.get(Calendar.YEAR));
        return currentTime;
    }
}
