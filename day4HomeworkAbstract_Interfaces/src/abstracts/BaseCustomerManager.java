package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void save(Customer customer) throws Exception {
		System.out.println( customer.getFirstName() +  ": Veritabanýna Kaydedildi");
	}

}
