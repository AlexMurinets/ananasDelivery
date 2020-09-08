package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class TestController {


    @GetMapping("/getMessage")
    public String getMessage(){
        return "hello";
    }

    @GetMapping("/getArray")
    private Map getArray(){
        Map<String,String> list = new HashMap<>();
        list.put("Message","Hi!");
        list.put("Time","25.09.2009");
      return list;
    }
}

