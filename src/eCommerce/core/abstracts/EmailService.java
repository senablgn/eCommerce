package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface EmailService {
	
	boolean checkEmail(String email);
	void verificationEmail(User user);
	

}
