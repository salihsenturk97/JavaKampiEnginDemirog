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
	User user1 = new User("Salih","Þentürk","salihsenturk97@gmail.com","1234567"); // TAM DOÐRU
	User user2 = new User("S","Þentürk","salih@kodlama.io","12345678910") ; // ÝSÝM 2 HANDEDEN AZ
	User user3 = new User("Salih","A","salihsenturks@kodlama.io","123456789") ; // SOYÝSÝM 2 HANDEDEN AZ
	User user4 = new User("Salih","Þentürk","slh","1234567987") ; // Hatalý mail adresi
	User user5 = new User("Salih","Þentürk","salihsenturk97@kodlama.io","123") ; // ÞÝFRE AZ HANELÝ
	User user6 = new User("Salih","Þentürk","salihsenturk97@gmail.com","123456987") ; // AYNI MAÝL ADRESÝ
		ArrayList<String> emails = new ArrayList<String>();
		UserService userService = new UserManager(new RegexValidator(), new DatabaseDao(),emails);
		RegexValidator regexValidator = new RegexValidator();
		GoogleAuthAdapter authAdapter = new GoogleAuthAdapter(userService);			
		DatabaseDao databaseDao = new DatabaseDao();
		User[] users = { user1, user2,user3,user4,user5,user6 };
		for (User user : users ) {

			
			// BUNLARDAN HERHANGÝ BÝRÝNÝ TEST EDEBÝLÝRSÝNÝZ HEPSÝ ÇALIÞIYOR.
			
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
