package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" registered");
		
	}
	
	
	

}
