package day4HomeworkAbstract_Interfaces;

import java.net.MalformedURLException;
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import adapters.MernisAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Mehmet");
		customer.setLastName("AYSAL");
		customer.setNationalityId("12345678900");
		
		customer.setBirthDate(LocalDate.of(1992, 6, 1));
		
		
		

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisAdapter());
		baseCustomerManager.save(customer);

	}

	

}
