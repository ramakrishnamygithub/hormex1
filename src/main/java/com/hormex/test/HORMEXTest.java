package com.hormex.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hormex.entities.Actor;

public class HORMEXTest {
	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		       Session session=sessionFactory.openSession();
		    // Account account=  session.get(Account.class, 1);
		       Actor  actor=  session.get(Actor.class, 1);
		     System.out.println(actor);
		     Actor  actor2 = session.get(Actor.class, 2);
		     System.out.println(actor2);
	}

}
