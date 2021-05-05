package abstracts;

import java.net.MalformedURLException;

import entities.Customer;

public interface CustomerCheckService {
	
 boolean checkIfRealPerson(Customer customer) throws MalformedURLException;

}
