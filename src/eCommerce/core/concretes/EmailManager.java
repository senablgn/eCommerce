package eCommerce.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.EmailService;
import eCommerce.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public boolean checkEmail(String email) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = email;

		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();

	}

	@Override
	public void verificationEmail(User user) {
		System.out.println("verification email sent : "+user.getEmail());

	}

	
	

}
