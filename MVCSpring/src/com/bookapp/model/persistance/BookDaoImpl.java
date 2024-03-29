package com.bookapp.model.persistance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository

public class BookDaoImpl implements BookDao {
@Autowired
	private SessionFactory factory;

	public BookDaoImpl() {
	
}
	public Session getSession() {
		return factory.openSession();
	}
@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Book").list();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return (Book) getSession().get(Book.class, bookId);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		getSession().save(book);

		return book;
	}

	@Override
	public Book updateBook(Book book) {

		getSession().update(book);
		return book;
	}

	@Override
	public Book removeBook(int bookId) {
		Book bookToBeDeleted = getBookById(bookId);
		getSession().delete(bookToBeDeleted);

		return bookToBeDeleted;
	}

}
