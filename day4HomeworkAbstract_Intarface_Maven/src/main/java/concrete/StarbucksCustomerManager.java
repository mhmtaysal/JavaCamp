package concrete;

import java.net.MalformedURLException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws MalformedURLException {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else

			System.out.println("Kimlik bilgileriniz doðrulanmadý");

	}
}
