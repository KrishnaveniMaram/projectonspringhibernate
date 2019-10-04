package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;
import com.bookapp.model.persistance.BookDaoImpl;

public class BookServiceImpl implements BookService {

	
	 private BookDao dao;
	  public BookServiceImpl() {
		// TODO Auto-generated constructor stub
		  dao=new BookDaoImpl();
	}
	 
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		Book book=dao.getBookById(bookId);
		
		if(book==null)
		throw new BookNotFoundException("book with id:"+bookId+"is not found");
		return book;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	@Override
	public Book removeBook(int bookId) {
		// TODO Auto-generated method stub
		return dao.removeBook(bookId);
	}

}