package Core.concretes;

import java.util.Scanner;

import Core.abstracts.UserVerifyService;


public class UserVerifyCode implements UserVerifyService {

	@Override
	public boolean userVerify() {
		
		int realcode = (int) (Math.random() * 100000);
		System.out.println("Doðrulama kodunuz: "+realcode);
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Doðrulama kodunu giriniz..");
		int inputCode=input.nextInt();
		
		if(realcode==inputCode) {
			return true;
		}
		
		return false;
		
	}



}
