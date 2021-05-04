package classes;

import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Nero m��teri y�neticisi: do�rulama ba�ar�l�.");
			super.save(customer);
		}else {
			System.out.println("Nero M��teri Y�neticisi: Do�rulama Hatas� - Ge�erli bir ki�i de�il.");
		}
	}
    
}
