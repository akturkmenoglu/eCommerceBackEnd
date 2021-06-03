package Core;

import Entites.concretes.User;

public class GoogleAuthenticationAdapter {

	public void login(User user) {
		GoogleAuthentication googleAuthentication = new GoogleAuthentication();
		googleAuthentication.login(user.getEmail());
		
	}
	
	
	
}
