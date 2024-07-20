package eCommerce.google;

import eCommerce.entities.concretes.User;

public class GoogleRegisterManager {
	public void registerWithGoogle(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" registered with google");
	}

}
