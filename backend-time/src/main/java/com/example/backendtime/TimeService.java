package com.example.backendtime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@CrossOrigin(allowCredentials = "true",origins = "*")
public class TimeService {

    @GetMapping("/api/time")
    public long getCurrentTime(){
        return new Date().getTime();
    }
}
