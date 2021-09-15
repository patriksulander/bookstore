package fi.haagahelia.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Bookstorecontroller {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)	
	public String hello() {
		
		
		return "hellobookstore" ;
	}
}
