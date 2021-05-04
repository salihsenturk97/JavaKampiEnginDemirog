
import java.util.Date;

import adapters.MernisServiceAdapter;
import classes.CustomerCheckManager;
import classes.NeroCustomerManager;
import classes.StarbuckCustomerManager;
import entities.Customer;
import interfaces.BaseCustomerManager;


public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Salih","Þentürk","41965640702",new Date(1997,1,31));
		Customer customer2 = new Customer(2,"Engin","Demiroð","00000000000",new Date(1997,1,31));
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());	
		
		BaseCustomerManager starbucksCustomerManager = new StarbuckCustomerManager(new MernisServiceAdapter());	
		
		Customer[] customers = { customer1, customer2 };	
		
		
		for (Customer customer : customers ) {
			
			neroCustomerManager.save(customer);

			starbucksCustomerManager.save(customer);
			
		}
		
	}

}
