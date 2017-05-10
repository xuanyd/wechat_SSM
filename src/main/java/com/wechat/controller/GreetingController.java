package com.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;  

import com.wechat.service.UserService;
import com.wechat.domain.User;
@Controller
public class GreetingController {

	@Autowired
	private UserService userService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        User user = userService.selectUserById(new Integer(5));
        System.out.println("--------" + user);
        return "listuser";
    }

}