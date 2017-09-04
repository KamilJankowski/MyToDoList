package main.java.co.uk.kjankowski.mytodolist.controller;

import java.util.List;

import main.java.co.uk.kjankowski.mytodolist.dao.MyListDAO;
import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MyListController {
	
	@Autowired
	private MyListDAO mylistDAO;
	public static int meditBtnTask;
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public String mylistPage(Model model) {
		
		List<MyList> list = mylistDAO.listMyList();
		model.addAttribute("mylist", list);
		
		return "index";
		
	}
	
	@RequestMapping( params="deleteBtnTask")
	public String delete(@RequestParam("deleteBtnTask")  Integer deleteBtnTask, Model model) {
		
		model.addAttribute("id", deleteBtnTask);
		
		System.out.println("wynik "+ deleteBtnTask);
		
		mylistDAO.deleteTask(deleteBtnTask);
		
		return "delTask";
				
	}
	
	@RequestMapping( params="editBtnTask")
	public String editTask(@RequestParam("editBtnTask")  Integer editBtnTask, Model model) {
		
				
		System.out.println("wynik "+ editBtnTask);
		
		List<MyList> list = mylistDAO.selectTask(editBtnTask);
		model.addAttribute("mylist", list);
		
		return "editTask";
				
	}
	

}
