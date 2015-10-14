package org.nazar.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nazar.mubeen.dto.Address;
import org.nazar.mubeen.dto.UserDetails;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails user=new UserDetails();
		UserDetails user2=new UserDetails();
		Address addr=new Address();
		addr.setCity("lucknow");
		addr.setState("up");
		addr.setStreet("sss");
		addr.setPincode("56565");
		user.setUsername("first user");
		
		user.setJoineddate(new Date());
		
		user.setDescription("this is my game");
	    user.setAddress(addr);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		//user=null;
	//	session=sessionFactory.openSession();
	//	session.beginTransaction();
	//	user=(UserDetails)session.get(UserDetails.class, 2);
	//	System.out.println("user name"+user.getUsername());
		
	}

}
