package org.jdsc.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.jdsc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("getuser.do")
	public Object getuser(){
		System.err.println();
		List<Map> list = this.userService.getUser();
		System.err.println(list.toString());
		return list;
	}
}
