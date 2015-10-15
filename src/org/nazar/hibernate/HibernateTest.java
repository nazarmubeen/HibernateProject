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
		Address addr2=new Address();
		addr.setCity("lucknow");
		addr.setState("up");
		addr.setStreet("sss");
		addr.setPincode("56565");
		addr2.setCity("lucsaknow");
		addr2.setState("uppsp");
		addr2.setStreet("ssx5ss");
		addr2.setPincode("562565");
		user.setUsername("first user");
		
		user.setJoineddate(new Date());
		
		user.setDescription("this is my game");
	    user.getListofaddresses().add(addr);
	    user.getListofaddresses().add(addr2);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	
		session.getTransaction().commit();
		session.close();
		
		//user=null;
	//	session=sessionFactory.openSession();
	//	session.beginTransaction();
	//	user=(UserDetails)session.get(UserDetails.class, 2);
	//	System.out.println("user name"+user.getUsername());
		
	}

}
