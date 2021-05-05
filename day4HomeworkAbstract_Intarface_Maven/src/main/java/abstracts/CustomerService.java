package abstracts;

import java.net.MalformedURLException;

import entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws MalformedURLException;

}
