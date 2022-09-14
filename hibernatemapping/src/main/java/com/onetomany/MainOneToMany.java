package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOneToMany {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		
			Questions q = new Questions();
			q.setQname("whate is Principle of oop? ");
			
			
			Answers a1 = new Answers();
			a1.setAid(5);
			a1.setSolution("Class");
			a1.setQustions(q);
			
			Answers a2 = new Answers();
			a2.setAid(6);
			a2.setSolution("Object");
			a2.setQustions(q);
			
			Answers a3 = new Answers();
			a3.setAid(7);
			a3.setSolution("Encapsulation");
			a3.setQustions(q);
			
			Answers a4 = new Answers();
			a4.setAid(8);
			a4.setSolution("Ploymorphism");
			a4.setQustions(q);
			
			List<Answers> listA = new ArrayList<Answers>();
			listA.add(a1);
			listA.add(a2);
			listA.add(a3);
			listA.add(a4);
			
			q.setAnswers(listA);
			ses.save(q);
			ses.save(a1);
			ses.save(a2);
			ses.save(a3);
			ses.save(a4);
			
			tx.commit();
			ses.close();
			
		
	}

}
