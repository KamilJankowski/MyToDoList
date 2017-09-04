package main.java.co.uk.kjankowski.mytodolist.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.co.uk.kjankowski.mytodolist.dao.MyListDAO;

import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateTaskController {

	
	@Autowired
	private MyListDAO mylistDAO;

/*	@RequestMapping(value = { "/editTask" }, method = RequestMethod.GET)
	public String mylistPage() {
		
		
		return "editTask";
		
	}*/
	
	@RequestMapping(value= {"/updateTask"},  method = RequestMethod.POST)
	public String updateTask(@ModelAttribute("SpringWeb")MyList mylist, Model model, @RequestParam("updateBtnTask")  Integer updateBtnTask){
	
		model.addAttribute("subject", mylist.getSubject());
		model.addAttribute("description", mylist.getDescription());
		
		
		String readsubject = mylist.getSubject();
		String readdescription = mylist.getDescription();
		
		System.out.println(updateBtnTask);
		System.out.println(readsubject);
		System.out.println(readdescription);
		
		
		mylistDAO.updateTask(updateBtnTask, readsubject, readdescription);
		
		return "updateTask";
		
	}
}
