package com.example.demo6.controller;

import com.example.demo6.entity.TestEntity;
import com.example.demo6.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo6/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }


}
