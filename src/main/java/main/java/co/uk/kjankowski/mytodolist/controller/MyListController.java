package main.java.co.uk.kjankowski.mytodolist.controller;

import java.util.List;

import main.java.co.uk.kjankowski.mytodolist.dao.MyListDAO;
import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MyListController {
	
	@Autowired
	private MyListDAO mylistDAO;
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public String mylistPage(Model model) {
		
		List<MyList> list = mylistDAO.listMyList();
		model.addAttribute("mylist", list);
		
		return "index";
		
	}
	

}
