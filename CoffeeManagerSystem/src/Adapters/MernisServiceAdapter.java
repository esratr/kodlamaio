package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoap control = new KPSPublicSoapProxy();
		
	
		return control.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyIdNumber()),customer.getName().toUpperCase(),
				customer.getLastName().toUpperCase(),customer.getDateOfBirth());
	}

}
