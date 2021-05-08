package Core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class PasswordValidator implements ValidatorService{
	String passwordPattern="^.{6,}$";
	Pattern pattern=Pattern.compile(passwordPattern);

	@Override
	public boolean checkUser(User user) {
		
		Matcher matcher=pattern.matcher(user.getPassword());
		if(matcher.matches()==true) {
			System.out.println("Ge�erli parola..");
			return true;
		}
		System.out.println("Ge�ersiz parola...");
		return false;
	}

}
