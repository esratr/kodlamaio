import java.rmi.RemoteException;
import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseManager = new StarbucksCustomerManager(new MernisServiceAdapter()) ;
			
		
			
		baseManager.save(new Customer(1,"Esra","Týrpancý",1996,"12345678912"));
		
	

	}

}
