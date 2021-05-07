package day5hw5.dataAccess.concretes;

import day5hw5.dataAccess.abstracts.UserDao;
import day5hw5.entities.concretes.User;

public class DatabaseDao implements UserDao {

	@Override
	public void createUser(User user) {
		System.out.println("Kullanýcý oluþturuldu : "+ user.getName() +" Mail: " +user.getEmail());
		
	}

	@Override
	public void getUser(User user) {
		
		System.out.println("Adý: "+ user.getName() +"Soyadý: "+user.getSurname() +" Mail: " +user.getEmail()+ "Þifresi: " +user.getPassword());
		
	}

	@Override
	public void deleteUser(User user) {
		
		System.out.println("Kullanýcý veritabanýnda silindi : "+ user.getName() +" Mail: " +user.getEmail());
		
	}

	@Override
	public void updateUser(User user) {
		
		System.out.println("Kullanýcý güncellendi : "+ user.getName() +" Mail: " +user.getEmail());
		
	}
	

}

