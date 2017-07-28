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
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddTaskController {

	@Autowired
	private MyListDAO mylistDAO;

	@RequestMapping(value = { "/task" }, method = RequestMethod.GET)
	public ModelAndView task() {
		return new ModelAndView("task", "command", new MyList(null, null, null));
	}
	
	@RequestMapping(value = {"/addTask"}, method = RequestMethod.POST)
	public String addtask(@ModelAttribute("SpringWeb")MyList mylist, Model model){
		model.addAttribute("subject", mylist.getSubject());
		model.addAttribute("description", mylist.getDescription());
		
		List<MyList> addTaskToMyList = new ArrayList<MyList>();
			
		String readsubject = mylist.getSubject();
		String readdescription = mylist.getDescription();
		
		System.out.println(readsubject);
		System.out.println(readdescription);
		
		mylistDAO.insertTask(readsubject, readdescription);
		System.out.println(readdescription);
		return "addTask";
	}
}
