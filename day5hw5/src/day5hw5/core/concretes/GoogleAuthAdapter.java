package day5hw5.core.concretes;

import Google.GoogleAuth;
import day5hw5.business.abstracts.UserService;
import day5hw5.core.abstracts.AuthService;
import day5hw5.entities.concretes.User;

public class GoogleAuthAdapter implements AuthService {
	private UserService userService ;
	
	public GoogleAuthAdapter(UserService userService) {
		
		this.userService=userService;
	}

	@Override
	public void auth(User user) {
		
		GoogleAuth googleAuth = new GoogleAuth();
		googleAuth.authUserGoogle(user);
		
	}
	
	
	

}
