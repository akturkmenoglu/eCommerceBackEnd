package Business.concretes;

import Business.abstracts.VerificationService;
import Entites.concretes.User;

public class MailVerifcation implements VerificationService{

	@Override
	public void login(User user) {
		System.out.println("Verification code is sended to "+user.getEmail());		
	}
	
}
