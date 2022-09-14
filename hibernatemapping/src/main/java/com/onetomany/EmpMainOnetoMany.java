package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMainOnetoMany {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		
		DepartmentEmp d = new DepartmentEmp();
		d.setE_departName("Computer");
		
		Employee e = new Employee();
		e.setE_id(11);
		e.setE_name("Komal");
		e.setE_age(24);
		e.setDepart(d);
		
		Employee e1 = new Employee();
		e1.setE_id(22);
		e1.setE_name("Amruta");
		e1.setE_age(25);
		e1.setDepart(d);
		
		Employee e2 = new Employee();
		e2.setE_id(33);
		e2.setE_name("Ankita");
		e2.setE_age(26);
		e2.setDepart(d);
		
		Employee e3 = new Employee();
		e3.setE_id(44);
		e3.setE_name("Janavi");
		e3.setE_age(27);
		e3.setDepart(d);
		
		Employee e4 = new Employee();
		e4.setE_id(55);
		e4.setE_name("Sonali");
		e4.setE_age(28);
		e4.setDepart(d);
		
		List<Employee> lemp = new ArrayList<Employee>();
		lemp.add(e);
		lemp.add(e1);
		lemp.add(e2);
		lemp.add(e3);
		lemp.add(e4);
		
		d.setEmployee(lemp);
		ses.save(d);
		ses.save(e);
		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		
		tx.commit();
		ses.close();
		
		System.out.println("Emloyees Created Successfully");
		

	}

}
