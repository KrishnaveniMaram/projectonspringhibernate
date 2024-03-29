package com.bookapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookapp.model.service.BookService;
@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "allbooks", method = RequestMethod.GET)
	public String getBooks(ModelMap map) {
		map.addAttribute("books", bookService.getAllBooks());
		return "all_books";
	}

}
