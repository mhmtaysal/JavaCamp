package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		
		boolean result =  false;
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getBirthDate().getYear());
				
		}
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		
		
		
	}
		
		return result;

}
}
