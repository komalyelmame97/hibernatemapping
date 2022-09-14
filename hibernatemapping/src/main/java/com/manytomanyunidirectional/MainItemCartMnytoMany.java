package com.manytomanyunidirectional;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainItemCartMnytoMany {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		Item i = new Item();
		i.setPrice(3000);
		i.setDescription("samsung");
		
		Item i1 = new Item();
		i1.setPrice(4000);
		i1.setDescription("nokiya");
		
		Item i2 = new Item();
		i2.setPrice(5000);
		i2.setDescription("opo");
		
		Cart c = new Cart();
		c.setTotal(12000);
		
		Set<Item> item = new HashSet<Item>();
		item.add(i);
		item.add(i1);
		item.add(i2);
		
		c.setItem(item);
		ses.save(c);
		tx.commit();
		ses.close();
		
		
	}

}
