package com.DaoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dbManager.*;
import com.dbManager.*;
import com.Dao.BookDao;
import com.Model.Book;

public class BookDaoImp implements BookDao {

	@Override
	public Integer addBook(Book book) {
		int row=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		session.save(book);
		t.commit();
		//factory.close();
		session.close();}
		
		 catch(Exception e)
        {
            e.printStackTrace();
        }
			
      
		return row;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list=new ArrayList<>(); 
		try
        {
            
			SessionFactory factory=HibernateConnection.getConnection();
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();
			list = session.createQuery("From book").list();
			t.commit();
			//factory.close();
			session.close();
			
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		return list;
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		try
		{
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		Book book=new Book();
		book=session.get(Book.class, id);
		session.remove(book);
		t.commit();
		//factory.close();
		session.close();
		}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
	}

	@Override
	public Integer getIdByBook(String name) {
		Integer Id = 0;
		Book b= null;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		
		Query query = session.createQuery("from book B where B.title=:n");
		query.setParameter("n", name);
		List list = query.list();
		b= (Book) list.get(0);
		t.commit();
		//factory.close();
		session.close();
		}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
       
	return b.getBookId();
	}

	@Override
	public Book getBookById(int id) {
		Book b=null;
		try{
			SessionFactory factory=HibernateConnection.getConnection();
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction(); 
	     	b=session.get(Book.class, id);
		    t.commit();
			//factory.close();
			session.close();
			}
		 catch(Exception e)
	        {
	            e.printStackTrace();
	        }
		return b;
	}

	@Override
	public Integer updateBook(Book book) {
		int status=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
	    session.update(book);
	    t.commit();
		//factory.close();
		session.close();
		}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
			
			return status;
	}

}
