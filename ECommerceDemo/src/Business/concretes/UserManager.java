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
				System.out.println("Kay�t ba�ar�s�z ");
				return;
			}
		
	}
		if(userVerifyService.userVerify()==false) 
		{
			System.out.println("Do�rulama ba�ar�s�z...");
			return;
		}
		else 
		{
			System.out.println("Do�rulama ba�ar�l�...");
			
			userDao.add(user);
		}
			
	}
	@Override
	public void login(User user) {
		Scanner input=new Scanner(System.in);
		System.out.println("L�tfen mailinizi giriniz..");
		String email=input.nextLine();
		System.out.println("L�tfen �ifrenizi giriniz..");
		String password=input.nextLine();
		
		//System.out.println(user.getEmail()+ " " +user.getPassword());
		
		if(email.equals(user.getEmail())&& password.equals(user.getPassword())) {
			userDao.login(user.getEmail(), user.getPassword());
			
			return;
			//System.out.println("Giri� ba�ar�l�..");
		}
		else {
			System.out.println("Giri� ba�ar�s�z..");
		
		}
	}

	@Override
	public void googleRegister(User user) {
		
		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Google ile kay�t ba�ar�s�z ");
				System.out.println("*******");
				return;
			}
	
		}
		
		if(apiService.checkMail(user.getEmail())==true) {
			apiService.log("Google ile kay�t: " +user.getFirstName());
			System.out.println("*******");
			userDao.add(user);
		}
		
	}

	@Override
	public void googleLogin(User user) {
		
	}
    

}