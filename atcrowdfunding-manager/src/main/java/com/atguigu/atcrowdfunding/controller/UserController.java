package com.atguigu.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/index")
	public String index(Integer pageno,Integer pagesize){
		return "user/index";
	}
}
