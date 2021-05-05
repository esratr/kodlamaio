package Concrete;


import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer)  {
		try {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
				System.out.println("Kiþi doðrulandý. ");
			}else {
				System.out.println("kiþi doðrulanamadý");
				
			}
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

}
