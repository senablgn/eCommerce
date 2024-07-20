package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.EmailService;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;
	private GoogleService googleService;

	public UserManager(UserDao userDao, EmailService emailService,GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
		this.googleService=googleService;
	}

	@Override
	public void register(User user) {

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Name and surname must consist of at least two characters.");
			return;
		}
		if (user.getPassword().length() < 6) {
			System.out.println("The password must consist of at least 6 characters.");
			return;
		}

		if (emailService.checkEmail(user.getEmail())) {
			emailService.verificationEmail(user);
			userDao.register(user);

		} else {
			System.out.println("wrong email format");
		}

	}
	
	

	@Override
	public void registerWithGoogle(User user) {
		googleService.registerWithGoogle(user);

	}

	@Override
	public void logIn(User user, String mail, String password) {
		if(user.getEmail().equals(mail)&&user.getPassword().equals(password)) {
			System.out.println(user.getEmail()+" : Login Ýs Succesfuly Completed");
		}else {
			System.out.println("wrong information ");
		}
		
	}

	
	
	

}
