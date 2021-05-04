package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPlayer(Player player)  {
		KPSPublicSoap control = new KPSPublicSoapProxy();
		
		boolean result;
		result = false;
	
		try {
			result = control.TCKimlikNoDogrula(player.getNationaltyIdNumber(), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirth());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(RemoteException e){
			e.printStackTrace();
		}
		System.out.println("doðrulama: " + (result  ? "baþarýlý" : "basarýsýz"));
		return result;
		
	}
	


}
