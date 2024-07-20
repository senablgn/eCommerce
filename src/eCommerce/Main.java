package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.EmailManager;
import eCommerce.core.concretes.GoogleRegisterManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 User user=new User(2, "sena", "bilgin", "sena@gmail.com", "123456");
		 UserService userService=new UserManager(new HibernateUserDao(),new EmailManager(),new GoogleRegisterManagerAdapter());
		 userService.register(user);
		 userService.registerWithGoogle(user);
		 userService.logIn(user, "sena@gmail.com", "123456");

	}

}
