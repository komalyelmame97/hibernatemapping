package com.namequery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainNameQuery {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
//		Learner learner = new Learner("Komal", "Pune");
//		Learner learner1 = new Learner("Amruta", "Nashik");
//		Learner learner2 = new Learner("Ankita", "Mumbai");
//		
//		
//		ses.save(learner);
//		ses.save(learner1);
//		ses.save(learner2);
		
	
		
//	Query query = ses.getNamedQuery("findLearnerbyId");//search by id
//	query.setInteger("Id1", 1);
	
//	Query query = ses.getNamedQuery("findLearnerbyName");//name find with a
		
//	Query query = ses.getNamedQuery("findLearnerbyIdDesc");	
		
//	Query query = ses.getNamedQuery("findCitybyName");
//	query.setString("lname", "Komal");
//	List<Learner>list=query.list();
//	for(int i=0;i<list.size();i++)
//	{
//		System.out.println("id: " + list.get(i).getId());
//		System.out.println("name: " + list.get(i).getName());
//		System.out.println("city: " + list.get(i).getCity());
//	}	
		
//	Query query	 = ses.createQuery("select count (name) from Learner");
//	System.out.println("Count: " + query.list().get(0));
		
//		Query query	 = ses.createQuery("delete from Learner where id=:LId");	
//		query.setParameter("LId", 3);
//		int status = query.executeUpdate();
//		System.out.println("Status: " +status);
		
		Query query	 = ses.createQuery("update Learner set name=:LName where id=:LId ");	
		query.setParameter("LName", "Shubh");
		query.setParameter("LId", 2);
		int status = query.executeUpdate();
		System.out.println("Status: " +status);
		

			
	tx.commit();
	ses.close();;
	}

}
