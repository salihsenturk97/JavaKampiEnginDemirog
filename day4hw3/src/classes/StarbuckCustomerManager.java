package classes;

import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class StarbuckCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;

	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Y�neticisi: Do�rulama ba�ar�l�.");
			super.save(customer);
		}else {
			System.out.println("Starbucks Y�neticisi: Do�rulama Hatas� - Ge�erli bir ki�i de�il.");
		}

	}

}
