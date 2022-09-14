package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestPerson {

	public static void main(String[] args) {
		
		try {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.getCurrentSession();
		Transaction tx=null;
		
		PersonDetail pDetail = new PersonDetail();
		pDetail.setZipCode("422103");
		pDetail.setJob("Accountant");
		pDetail.setSalary(40000.50);
		
		
		Person p = new Person();
		p.setPersonName("Komal");
		p.setPersonDetail(pDetail);
		
		
		// no need if we set cascadeTpye
		// ses.save(pDetail);

		ses=factory.openSession();
		tx=ses.beginTransaction();
		
		ses.save(p);
		ses.save(pDetail);
		
		tx.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
