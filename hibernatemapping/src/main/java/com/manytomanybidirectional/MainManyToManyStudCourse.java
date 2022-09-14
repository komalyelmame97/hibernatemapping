package com.manytomanybidirectional;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainManyToManyStudCourse {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		Student s = new Student("komal", "Lahamge", 24);
		Student s1 = new Student("Amruta", "Muradnar", 25);
		Student s2 = new Student("Lalita", "Yelmame", 26);
		
		Course c = new Course("Computer");
		Course c1 = new Course("Mecanical");
		Course c2 = new Course("Electrical");
		
		s.getCourse().add(c);
		s.getCourse().add(c1);
		s.getCourse().add(c2);
		
		s1.getCourse().add(c);
		s1.getCourse().add(c1);
		s1.getCourse().add(c2);
		
		s2.getCourse().add(c);
		s2.getCourse().add(c1);
		s2.getCourse().add(c2);
		
		
//		
//		List<Student> ls = new ArrayList<Student>();
//		ls.add(s);
//		ls.add(s1);
//		ls.add(s2);
//		
//		c.setStudent(ls);
//		ses.save(c);
//		ses.save(c1);
//		ses.save(c2);
////		ses.save(s2);
		ses.persist(s);
		ses.persist(s1);
		ses.persist(s2);
		tx.commit();
		ses.close();
		
	}

}
