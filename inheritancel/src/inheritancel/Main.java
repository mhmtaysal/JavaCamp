package inheritancel;

public class Main {

	public static void main(String[] args) {

IndividualCustomer mehmet = new IndividualCustomer();
mehmet.customerNumber = "12345";

CorporateCustomer hepsiBurada = new CorporateCustomer();

hepsiBurada.CompanyName = "H.b;urada";
hepsiBurada.customerNumber = "1245";


CusomerManager customerManager = new CusomerManager();
customerManager.add(mehmet);
customerManager.add(hepsiBurada);

Customer[] customers = {mehmet,hepsiBurada};

customerManager.addMultiple(customers);




	}

}


// base/super