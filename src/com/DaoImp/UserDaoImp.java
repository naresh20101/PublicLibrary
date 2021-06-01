package com.DaoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Dao.UserDao;
import com.Model.User;
import com.dbManager.HibernateConnection;

public class UserDaoImp implements UserDao {

	@Override
	public Integer addUser(User user) {
		int row=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		session.save(user);
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
	public List<User> getUsers() {
		List<User> list=new ArrayList<>(); 
		try
        {
            
			SessionFactory factory=HibernateConnection.getConnection();
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();
			list = session.createQuery("From user").list();
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
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		try
		{
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		User user =new User();
		user=session.get(User.class, id);
		session.remove(user);
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
	public Integer getIdByUser(String user_name) {
		Integer Id = 0;
	    User u= null;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		
		Query query = session.createQuery("from user U where U.user_name=:n");
		query.setParameter("n", user_name);
		
		List list = query.list();
		
		u = (User) list.get(0);
		
		
		
		//Id=s.getId();
		
		t.commit();
		//factory.close();
		session.close();
		}
		 catch(Exception e)
        {
            e.printStackTrace();
        }
		
       
	return u.getUserId();
	}

	@Override
	public User getUserById(int id) {
		User user=null;
		try{
			SessionFactory factory=HibernateConnection.getConnection();
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction(); 
	     	user=session.get(User.class, id);
		    t.commit();
			//factory.close();
			session.close();
			}
		 catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			return user;

	}

	@Override
	public Integer updateUser(User user) {
		int status=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		session.update(user);
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
