package Api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleApiManager implements ApiService {

	@Override
	public boolean checkMail(String email) {
		String mailPattern="^[A-Z0-9._%+-]+@(gmail)+.(com)?$";
		Pattern pattern=Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
		
			Matcher matcher=pattern.matcher(email);
			if(matcher.matches()==true) {
				System.out.println("Mail pattern ba�ar�l�..");
				return true;
			}
			System.out.println("Ge�ersiz mail adresi...");
			return false;
			
	}

	@Override
	public void log(String message) {
		System.out.println("Google ile giri� ba�ar�l�.");
	}

}
