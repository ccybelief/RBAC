package com.atguigu.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}
	
	@RequestMapping("/index1")
	public String index1(@RequestParam(required=false,defaultValue= "1") Integer pageno,@RequestParam(required=false,defaultValue="2") Integer pagesize,Model model){
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("start", (pageno-1)*pagesize);
        map.put("size", pagesize);
        
        List<User> users = userService.pageQueryData(map);
        model.addAttribute("users", users);
        //当前页码
        model.addAttribute("pageno", pageno);
        //总的数据条数
        int totalsize = userService.pageQueryCount(map);
        //最大页码（总页码）
        int totalno = 0;
        if(totalsize % pagesize == 0){
        	totalno = totalsize / pagesize;
        }else{
        	totalno = totalsize / pagesize + 1;
        }
		return "user/index1";
	}
}
