package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		// müþteri ekleme kodlarý 

CustomerManager customerManager = new CustomerManager();
customerManager.add(new FileLogger());
	}

}
