package adapters;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Locale;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class MernisAdapter implements CustomerCheckService {
	
	private final String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

	@Override
	public boolean checkIfRealPerson(Customer customer) throws MalformedURLException {
		URL url = URI.create(endpoint).toURL();
		KPSPublic service = new KPSPublic(url);
		KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
		return port.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getBirthDate().getYear());
		
	}

}
