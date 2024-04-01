package com.example.demo.controller;

import com.example.demo.Model.Activity;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ActivityService activityService;

    @GetMapping(path = "/test", produces = "application/json")
    public String metodTest(){
        return "Hello Namdev !";

    }
    @GetMapping(path = "/activity", produces = "application/json")
    public Activity getActivity(){
        return activityService.getActivity();
    }



}
