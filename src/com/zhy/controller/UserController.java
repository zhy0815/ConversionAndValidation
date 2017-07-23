package com.zhy.controller;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhy.converter.DateEditor;
import com.zhy.model.User;

@Controller
public class UserController {
	private static final Log logger=LogFactory.getLog(UserController.class);
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		
		// 动态跳转页面
		return formName;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute User user,Model model) {
		logger.info("register");
		logger.info(user);
		model.addAttribute("user", user);
		return "success";
	}
	 /* 在控制器初始化时注册属性编辑器
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// 注册自定义编辑器
		binder.registerCustomEditor(Date.class, new DateEditor());
	}
	@RequestMapping(value="/register2",method=RequestMethod.POST)
	public String register2(@ModelAttribute User user,Model model) {
		logger.info("register");
		logger.info(user);
		model.addAttribute("user", user);
		return "success";
	}*/
//	@RequestMapping(value="/register3",method=RequestMethod.POST)
//	public String register3(@ModelAttribute User user,Model model) {
//		logger.info("register");
//		logger.info(user);
//		model.addAttribute("user", user);
//		return "success";
//	}
	@RequestMapping(value="/register4",method=RequestMethod.POST)
	public String register4(@ModelAttribute User user,Model model) {
		logger.info("register");
		logger.info(user);
		model.addAttribute("user", user);
		return "success";
	}
	@RequestMapping(value="/register5",method=RequestMethod.POST)
	public String register5(@ModelAttribute User user,Model model) {
		logger.info("register");
		logger.info(user);
		model.addAttribute("user", user);
		return "success";
	}
}
