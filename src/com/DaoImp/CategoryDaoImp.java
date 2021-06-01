package com.DaoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dbManager.*;
import com.Dao.CategoryDao;
import com.Model.Category;

public class CategoryDaoImp implements CategoryDao{

	@Override
	public Integer addCategory(Category category) {
		int row=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		session.save(category);
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
	public List<Category> getCategory() {
		List<Category> list=new ArrayList<>(); 
		try
        {
            
			SessionFactory factory=HibernateConnection.getConnection();
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();
			list = session.createQuery("From category").list();
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
	public void deleteCategory(Integer id) {
		try
		{
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		Category c=new Category();
		c=session.get(Category.class, id);
		session.remove(c);
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
	public Integer getIdByCategory(String name) {
		Integer Id = 0;
		Category c= null;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		
		Query query = session.createQuery("from category C where C.category=:n");
		query.setParameter("n", name);
		
		List list = query.list();
		
		c = (Category) list.get(0);
		
		
		
		//Id=s.getId();
		
		t.commit();
		//factory.close();
		session.close();
		}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
       
	return c.getCategoryId();
	}

	@Override
	public Category getCategoryById(int id) {
		Category c=null;
		try{
			SessionFactory factory=HibernateConnection.getConnection();
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction(); 
	     	c=session.get(Category.class, id);
		    t.commit();
			//factory.close();
			session.close();
			}
		 catch(Exception e)
	        {
	            e.printStackTrace();
	        }
		return c;
	}

	@Override
	public Integer updateCategory(Category category) {
		int status=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
	    
	    session.update(category);
	    t.commit();
		//factory.close();
		session.close();}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
			
			return status;
	}

}
