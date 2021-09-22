package fi.haagahelia.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.bookstore.domain.BookRepository;

@Controller

public class Bookstorecontroller {
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping("/booklist")	
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
}
