package com.example.demo6.controller;

import com.example.demo6.entity.User;
import com.example.demo6.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**** imports ****/
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisUserService myBatisUserService ;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        return myBatisUserService.getUser(id);
    }
}
