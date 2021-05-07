package day5hw5.dataAccess.abstracts;

import day5hw5.entities.concretes.User;

public interface UserDao {
	
	void createUser(User user);
	void getUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	
}