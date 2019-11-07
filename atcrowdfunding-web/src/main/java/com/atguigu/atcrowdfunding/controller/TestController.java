package com.atguigu.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
  @RequestMapping("/index")
  public String index(){
	  return "index";
  }
  @ResponseBody
  @RequestMapping("/json")
  public Object json(){
	  Map map = new HashMap();
	  map.put("username", "zhangsan");
	  return map;
  }
}