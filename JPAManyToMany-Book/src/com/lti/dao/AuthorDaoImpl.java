package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.model.Author;
import com.lti.model.Book;
import com.lti.utils.JpaUtils;

public class AuthorDaoImpl implements AuthorDao
{
private EntityManager entityManager;
	
	public AuthorDaoImpl() 
	{
		entityManager = JpaUtils.getEntityManager();
		init();
	}
	
	public void init(){
		Book book1 = new Book();
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
		
		Book book4 = new Book();
		book4.setBookISBN(1004);
		book4.setBookTitle("Mahashweta");
		book4.setPrice(700);
		
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
		author2.addBooks(book4);
		
		//save author using entity manager
			entityManager.getTransaction().begin();
			entityManager.persist(author1);
			entityManager.persist(author2);
			entityManager.getTransaction().commit();
		
		
	}
	
	
	@Override
	public List<Book> readAllBooks() {
		TypedQuery<Book> tquery = entityManager.createQuery("SELECT b FROM Book b",Book.class);
		List<Book> list = tquery.getResultList();
		return list;
	}

	@Override
	public List<Book> readBookByAuthor(String authorName) {
	//	Query query =entityManager.createQuery("select b from Book b where (select ab from Authorbook ab where(Select a from Author a where name= '"+authorName+"'))",Author.class);
	// WORKING QUERY:select * from Books where bookisbn=(select bookisbn from Authorbook where authorid=(Select authorid from Author where name='APJ Abdul Kalam'))
		String jpql = "Select b from Book b Inner Join b.authors a where a.authorName=:name";
		TypedQuery<Book> tquery = entityManager.createQuery(jpql, Book.class);
		tquery.setParameter("name",authorName);
		return tquery.getResultList();
	}

	@Override
	public List<Book> readBookWithinPrice(double min, double max) {
		TypedQuery<Book> tquery = entityManager.createQuery("SELECT b FROM Book b where price between "+min+" and "+max+"",Book.class);
		List<Book> list = tquery.getResultList();
		return list;
	}

	@Override
	public List<Author> readAuthorForBookId(long bookISBN) {
		String jpql = "Select a from Author a Inner Join a.books b where b.bookISBN=:id";
		TypedQuery<Author> tquery = entityManager.createQuery(jpql, Author.class);
		tquery.setParameter("id",bookISBN);
		return tquery.getResultList();
	}

}
