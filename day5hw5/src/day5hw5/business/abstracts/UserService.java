package day5hw5.business.abstracts;

import java.util.ArrayList;

import day5hw5.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(User user);
	void deleteAccount(User user);
	boolean hasSystem(User user,ArrayList<String> mailList);

}
