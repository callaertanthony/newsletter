package com.rizomm.newsletter.controller;

import com.rizomm.newsletter.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by anthonycallaert on 05/03/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/list")
    public String showUserList(Map<String, Object> model){
        model.put("list", userRepository.findAll());
        return "user/list";
    }
}
