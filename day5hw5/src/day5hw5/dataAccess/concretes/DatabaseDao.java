package day5hw5.dataAccess.concretes;

import day5hw5.dataAccess.abstracts.UserDao;
import day5hw5.entities.concretes.User;

public class DatabaseDao implements UserDao {

	@Override
	public void createUser(User user) {
		System.out.println("Kullan�c� olu�turuldu : "+ user.getName() +" Mail: " +user.getEmail());
		
	}

	@Override
	public void getUser(User user) {
		
		System.out.println("Ad�: "+ user.getName() +"Soyad�: "+user.getSurname() +" Mail: " +user.getEmail()+ "�ifresi: " +user.getPassword());
		
	}

	@Override
	public void deleteUser(User user) {
		
		System.out.println("Kullan�c� veritaban�nda silindi : "+ user.getName() +" Mail: " +user.getEmail());
		
	}

	@Override
	public void updateUser(User user) {
		
		System.out.println("Kullan�c� g�ncellendi : "+ user.getName() +" Mail: " +user.getEmail());
		
	}
	

}

