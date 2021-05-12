package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	
	@Override
	public void save(Customer customer)  {
		try {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
				System.out.println("Ki�i do�ruland�. ");
			}else {
				System.out.println("ki�i do�rulanamad�");
				
			}
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
}
}
