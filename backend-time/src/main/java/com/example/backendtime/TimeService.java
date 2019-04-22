package com.example.backendtime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimeService {

    @GetMapping("/api/time")
    public long getCurrentTime(){
        return new Date().getTime();
    }
}
