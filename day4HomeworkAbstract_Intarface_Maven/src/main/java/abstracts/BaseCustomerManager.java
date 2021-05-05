package abstracts;

import java.net.MalformedURLException;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void save(Customer customer) throws MalformedURLException {
		System.out.println( customer.getFirstName() +  ": Veritabanýna Kaydedildi");
	}

}
