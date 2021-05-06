

package day4HomeworkAbstract_Interfaces;


import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapters;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("MEHMET");
		customer.setLastName("AYSAL");
		customer.setNationalityId("11111111111");
		
		customer.setBirthDate(LocalDate.of(1992, 6, 1));
		
		
		

		BaseCustomerManager baseCustomerManager = new  StarbucksCustomerManager(new MernisServiceAdapters());
	
		
		
		try {
			baseCustomerManager.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	}
		
		

//	private static BaseCustomerManager StarbucksCustomerManager(MernisServiceAdapters mernisServiceAdapters) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

