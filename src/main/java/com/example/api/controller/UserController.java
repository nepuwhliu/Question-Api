package com.example.api.controller;


import com.example.api.entity.QuestionWithBLOBs;
import com.example.api.entity.User;
import com.example.api.service.IQuestionService;
import com.example.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login(String username, String password) {
        return userService.getUserInformation(username, password);
    }

}
