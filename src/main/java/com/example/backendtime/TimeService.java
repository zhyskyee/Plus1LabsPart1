package com.example.backendtime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@CrossOrigin(allowCredentials = "true",origins = "*")
public class TimeService {

    @GetMapping("/api/time")
    public TimeModel getCurrentTime(){
        Date toSend = new Date();
        TimeModel currentTime =new TimeModel();
        currentTime.setHours(toSend.getHours());
        currentTime.setMins(toSend.getMinutes());
        currentTime.setSecs(toSend.getSeconds());
        GregorianCalendar c = new GregorianCalendar();
        currentTime.setMonth(c.get(Calendar.MONTH));
        currentTime.setDay(c.get(Calendar.DAY_OF_MONTH));
        currentTime.setYear(c.get(Calendar.YEAR));
        return currentTime;
    }
}
