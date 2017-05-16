package com.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;  

@Controller
public class MainController {

	@RequestMapping("/login")
	public String login(){
		return "login";
	}

}