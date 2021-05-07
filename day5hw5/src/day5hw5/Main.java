package day5hw5;



import java.util.ArrayList;

import javax.xml.validation.Validator;

import day5hw5.business.abstracts.UserService;
import day5hw5.business.concretes.UserManager;
import day5hw5.core.concretes.GoogleAuthAdapter;
import day5hw5.core.concretes.RegexValidator;
import day5hw5.dataAccess.concretes.DatabaseDao;
import day5hw5.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
	User user1 = new User("Salih","�ent�rk","salihsenturk97@gmail.com","1234567"); // TAM DO�RU
	User user2 = new User("S","�ent�rk","salih@kodlama.io","12345678910") ; // �S�M 2 HANDEDEN AZ
	User user3 = new User("Salih","A","salihsenturks@kodlama.io","123456789") ; // SOY�S�M 2 HANDEDEN AZ
	User user4 = new User("Salih","�ent�rk","slh","1234567987") ; // Hatal� mail adresi
	User user5 = new User("Salih","�ent�rk","salihsenturk97@kodlama.io","123") ; // ��FRE AZ HANEL�
	User user6 = new User("Salih","�ent�rk","salihsenturk97@gmail.com","123456987") ; // AYNI MA�L ADRES�
		ArrayList<String> emails = new ArrayList<String>();
		UserService userService = new UserManager(new RegexValidator(), new DatabaseDao(),emails);
		RegexValidator regexValidator = new RegexValidator();
		GoogleAuthAdapter authAdapter = new GoogleAuthAdapter(userService);			
		DatabaseDao databaseDao = new DatabaseDao();
		User[] users = { user1, user2,user3,user4,user5,user6 };
		for (User user : users ) {

			
			// BUNLARDAN HERHANG� B�R�N� TEST EDEB�L�RS�N�Z HEPS� �ALI�IYOR.
			
			//userService.deleteAccount(user);
			//userService.register(user);			
			//authAdapter.auth(user);
			//regexValidator.validator(user);			
			//databaseDao.deleteUser(user);
			//databaseDao.createUser(user);
			//databaseDao.updateUser(user);
		}
	
		
		
		
		
		
		
	}

}
