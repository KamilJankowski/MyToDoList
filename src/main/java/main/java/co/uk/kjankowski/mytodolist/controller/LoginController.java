package main.java.co.uk.kjankowski.mytodolist.controller;


import java.util.ArrayList;
import java.util.List;

import main.java.co.uk.kjankowski.mytodolist.dao.UserDAO;

import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import main.java.co.uk.kjankowski.mytodolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("login")
public class LoginController {
	
	@Autowired 
	private UserDAO userDAO;
	
	@RequestMapping(value= {"/login"},  method = RequestMethod.GET )
	public String user() {
		
		return "login";
	}

	@RequestMapping(params= "submitLogin")
	public String authentication(@ModelAttribute("user") User user, Model model) {
		
		model.addAttribute("login", user.getLogin());
		model.addAttribute("password", user.getPassword());
		
		String readlogin = user.getLogin();
		String readpassword = user.getPassword();
		boolean existingUser = userDAO.auth(readlogin, readpassword);
		if(existingUser==true) {
			String redirectUrl = "/";
			return "redirect:" + redirectUrl;
		}
		else {
		return "loginresult";
		}
	}
	
	
}
