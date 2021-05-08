import Api.ApiService;
import Api.GoogleApiManager;
import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.abstracts.UserVerifyService;
import Core.abstracts.ValidatorService;
import Core.concretes.MailValidator;
import Core.concretes.NameValidator;
import Core.concretes.PasswordValidator;
import Core.concretes.RepeatMailValidator;
import Core.concretes.UserVerifyCode;
import DataAccess.concretes.OracleUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ValidatorService[] validatorService = { new MailValidator(), new PasswordValidator(), new NameValidator(),
				new RepeatMailValidator() };

		UserVerifyService userVerifyServiceAdapter = new UserVerifyCode();
		ApiService apiService = new GoogleApiManager();

		User user1 = new User(1, "esratr@gmail.com", "2589654", "esra", "t�rpanc�");
		UserService userService = new UserManager(new OracleUserDao(), validatorService, userVerifyServiceAdapter,
				apiService);
		userService.register(user1);
		userService.login(user1);
		System.out.println("-------------------------------------------------");

	}

}
