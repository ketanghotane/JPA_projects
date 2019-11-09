package com.lti.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Author;
import com.lti.model.Book;
import com.lti.service.AuthorServiceImpl;

public class Main {

	public static void main(String[] args) {
		/*
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();*/
		
		//Define Books
		/*Book book1 = new Book();
		book1.setBookISBN(1001);
		book1.setBookTitle("Wings of Fire");
		book1.setPrice(450);
		
		Book book2 = new Book();
		book2.setBookISBN(1002);
		book2.setBookTitle("Wise Or Not Wise");
		book2.setPrice(250);
		
		Book book3 = new Book();
		book3.setBookISBN(1003);
		book3.setBookTitle("Robinson Crusoe");
		book3.setPrice(450);
		
		//Define Author
		
		Author author1 = new Author();
		author1.setAuthorId(101);
		author1.setAuthorName("APJ Adbul Kalam");
		
		author1.addBooks(book1);
		
		Author author2 = new Author();
		author2.setAuthorId(102);
		author2.setAuthorName("Sudha Murty");
		
		author2.addBooks(book2);
		author2.addBooks(book3);
		
		//save author using entity manager
			entityManager.getTransaction().begin();
			entityManager.persist(author1);
			entityManager.persist(author2);
			entityManager.getTransaction().commit();*/
		
		AuthorServiceImpl service = new AuthorServiceImpl();
		/*List<Book> list = service.findAllBooks();
		
		for(Book u : list)
		{
			System.out.println(u);
		}*/
		List<Author> list =service.findAuthorForBookId(1003);
		for(Author u: list)
		{
			System.out.println(u);
		} /*
		List<Book> list =service.findBookByAuthor("Sudha Murty");
		for(Book u: list)
		{
			System.out.println(u);
		}*/ 
		/*List<Book> list =service.findBookWithinPrice(200, 500);
		for(Book u: list)
		{
			System.out.println(u);
		}*/
	}

}
