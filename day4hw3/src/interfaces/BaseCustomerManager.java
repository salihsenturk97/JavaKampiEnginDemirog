package interfaces;

import entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Müþteri veritabanýna baþarýyla eklendi.");
	}

}
