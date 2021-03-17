package com.hibernate.CrudHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{

	public static void main( String[] args )
    {
    	Crud  c = new Crud();
    	
    	c.setSl_no(5);
    	c.setStudent_name("nidhi");
        c.setStudent_id("1s5");
    	c.setCourse("c");
    	
    	Configuration con =new Configuration().configure().addAnnotatedClass(Crud.class);  
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf= con.buildSessionFactory(reg);
    	Session session=sf.openSession(); 
        Transaction t=session.beginTransaction();
    	
        
        
        //Fetching data
    	//c=(Crud)session.get(Crud.class,3);
    	
    	
    	//for saving
    	//session.save(c);
    	
    	t.commit();
    	
    	System.out.println(c);
    	
    }
}
