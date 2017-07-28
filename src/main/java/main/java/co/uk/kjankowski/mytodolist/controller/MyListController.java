package main.java.co.uk.kjankowski.mytodolist.controller;

import java.util.List;

import main.java.co.uk.kjankowski.mytodolist.dao.MyListDAO;
import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
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
	
	@RequestMapping(value= {"/"}, method = RequestMethod.POST)
	public void handlePost(@RequestParam String deleteBtnTask){
	
		if(deleteBtnTask.equals("10")) {
			
			System.out.println("Hello 10!!!!");
		}
		
		
/*	String buttonDelMobiles = request.getParameter("delMobileBtn");

	for (Mobiles idmob : mlist) {
		if (idmob.getId().equals(buttonDelMobiles)) {

			
			String idMobiles1 = idmob.getId();

			DBUtils.removeIdMobile(conn, idMobiles1);

			doGet(request, response);
		}

	}*/
	}
	

}
