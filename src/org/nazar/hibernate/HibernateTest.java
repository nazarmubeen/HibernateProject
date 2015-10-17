package org.nazar.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nazar.mubeen.dto.Address;
import org.nazar.mubeen.dto.UserDetails;
import org.nazar.mubeen.dto.Vehicle;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails user=new UserDetails();
		Vehicle vehicle=new Vehicle();
		vehicle.setVehiclename("my car");
		
		user.setUsername("first user");
		
		user.setJoineddate(new Date());
		user.setVehicle(vehicle);
		user.setDescription("this is my game");
	  //  user.getListofaddresses().add(addr);
	  //  user.getListofaddresses().add(addr2);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	    session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	/*	
	user=null;
	session=sessionFactory.openSession();
	session.beginTransaction();
	user=(UserDetails)session.get(UserDetails.class, 11);
	//	System.out.println("user name"+user.getUsername());
	System.out.println(user.getListofaddresses().size());;	
	*/
	}

}
