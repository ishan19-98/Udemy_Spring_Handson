package com.in28minutes.springmvc;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.jee.LoginService;

@Controller
public class LoginController {
     
	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String SayHello()
	{
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String Welcome(@RequestParam String name,@RequestParam String password, ModelMap model)
	{
		if(!(loginservice.validateUser(name,password)))
		{
			model.put("errorMessage", "Invalid User!!!!!!!!!!!!!!!!!!!");
			return "login";
		}
		else
		{
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}
	}
}
