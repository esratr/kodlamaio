package Business.concretes;

import java.util.Scanner;

import Api.ApiService;
import Business.abstracts.UserService;
import Core.abstracts.UserVerifyService;
import Core.abstracts.ValidatorService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	private  ValidatorService [] validatorService;
	private UserDao userDao;
	private UserVerifyService userVerifyService;
	private ApiService apiService;
	
	  public UserManager(UserDao userDao, ValidatorService[] validatorService, UserVerifyService userVerifyService, 
			  ApiService apiService) {
		
		  super();
		this.userDao = userDao;
		this.validatorService = validatorService;
		this.userVerifyService = userVerifyService;
		this.apiService = apiService;
	}

	@Override
	public void register(User user) {
		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Kayýt baþarýsýz ");
				return;
			}
		
	}
		if(userVerifyService.userVerify()==false) 
		{
			System.out.println("Doðrulama baþarýsýz...");
			return;
		}
		else 
		{
			System.out.println("Doðrulama baþarýlý...");
			
			userDao.add(user);
		}
			
	}
	@Override
	public void login(User user) {
		Scanner input=new Scanner(System.in);
		System.out.println("Lütfen mailinizi giriniz..");
		String email=input.nextLine();
		System.out.println("Lütfen þifrenizi giriniz..");
		String password=input.nextLine();
		
		//System.out.println(user.getEmail()+ " " +user.getPassword());
		
		if(email.equals(user.getEmail())&& password.equals(user.getPassword())) {
			userDao.login(user.getEmail(), user.getPassword());
			
			return;
			//System.out.println("Giriþ baþarýlý..");
		}
		else {
			System.out.println("Giriþ baþarýsýz..");
		
		}
	}

	@Override
	public void googleRegister(User user) {
		
		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Google ile kayýt baþarýsýz ");
				System.out.println("*******");
				return;
			}
	
		}
		
		if(apiService.checkMail(user.getEmail())==true) {
			apiService.log("Google ile kayýt: " +user.getFirstName());
			System.out.println("*******");
			userDao.add(user);
		}
		
	}

	@Override
	public void googleLogin(User user) {
		
	}
    

}