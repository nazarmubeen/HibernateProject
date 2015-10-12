package org.nazar.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nazar.mubeen.dto.UserDetails;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails user=new UserDetails();
		user.setUserid(2);
		user.setUsername("second user");
		user.setAddress("lucknow");
		user.setJoineddate(new Date());
		user.setDescription("this is my game");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user=null;
		session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails)session.get(UserDetails.class, 2);
		System.out.println("user name"+user.getUsername());
		
	}

}
