package com.DaoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Dao.RentDao;
import com.Model.Rent;
import com.dbManager.HibernateConnection;

public class RentDaoImp implements RentDao {

	@Override
	public Integer addRent(Rent rent) {
		int row=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
		session.save(rent);
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
	public List<Rent> getRents() {
		List<Rent> list=new ArrayList<>(); 
		try
        {
            
			SessionFactory factory=HibernateConnection.getConnection();
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();
			list = session.createQuery("From rent").list();
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
	public void deleteRent(Integer id) {
		// TODO Auto-generated method stub
		try
		{
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		Rent rent=new Rent();
		rent=session.get(Rent.class, id);
		session.remove(rent);
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
	public Rent getRentById(int id) {
		Rent rent=new Rent();
		try{
			SessionFactory factory=HibernateConnection.getConnection();
		    Session session = factory.openSession();  
		    Transaction t = session.beginTransaction(); 
	       rent=session.get(Rent.class, id);
		    t.commit();
			//factory.close();
			session.close();
			}
		 catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			return rent;
	}

	@Override
	public Integer updateRent(Rent rent) {
		int status=0;
		try {
		SessionFactory factory=HibernateConnection.getConnection();
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		
	    
	    session.update(rent);
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
