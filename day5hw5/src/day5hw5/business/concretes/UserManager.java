package day5hw5.business.concretes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import day5hw5.business.abstracts.UserService;
import day5hw5.core.abstracts.EmailValidator;
import day5hw5.dataAccess.abstracts.UserDao;
import day5hw5.entities.concretes.User;

public class UserManager implements UserService{
	
	private EmailValidator emailValidator;
	private UserDao userDao ;
	private ArrayList<String>emailList;
	
	public UserManager(EmailValidator emailValidator, UserDao userDao, ArrayList<String> emailList) {
		super();
		this.emailValidator = emailValidator;
		this.userDao = userDao;
		this.emailList = emailList;
	}
	
	@Override
	public boolean hasSystem(User user, ArrayList<String> mailList) {
		
		if(mailList.isEmpty()) {
			return false;
		}else {
			for(String email: mailList) {
				if(email==user.getEmail()) 
					return true;
			}
			return false;
		}
		
		
	
	}

	
		  
		
	@Override
	public void login(User user) {
		
		if(hasSystem(user, emailList)) {
			userDao.getUser(user);
			System.out.println("Giri� yap�ld� anasayfaya y�nlendiriliyorsunuz.");
		}
		else {
			System.out.println("�yelik bulunamad�, l�tfen kay�t olun.");
		}
		
	}

	@Override
	public void deleteAccount(User user) {
		try {
			emailList.remove(user.getEmail());
		}catch (Exception e) {
			System.out.println("Silmek istedi�iniz kullan�c� mevcut de�il \n Hata :"+ e );
			return;
		}
		userDao.deleteUser(user);
		
	}
	@Override
	public void register(User user) {
		
		if(hasSystem(user, emailList)) {
			System.out.println("Bu email ile daha �nce kay�t olmu�sunuz, l�tfen giri� yap�n.");
		}
		else {
			
			if( user.getPassword().length()>=6 && user.getName().length()>=2 && user.getSurname().length()>=2) {	//KAMPTAK� �ARTLAR
			
		//
						System.out.println("Do�rulama maili g�nderildi."); // Sim�lasyon
						
					
							emailList.add(user.getEmail());
							userDao.createUser(user);
			}
							
			else {
							System.out.println("Do�rulama Ba�ar�s�z.");
						}	
			
				}	
			}

	
	
}
