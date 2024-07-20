package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleService;
import eCommerce.entities.concretes.User;
import eCommerce.google.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleService{

	@Override
	public void registerWithGoogle(User user) {
		GoogleRegisterManager gManager=new GoogleRegisterManager();
		gManager.registerWithGoogle(user);
		
	}
	

}
