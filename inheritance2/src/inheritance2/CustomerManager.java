package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		// m��teri ekleme kodlar� 

CustomerManager customerManager = new CustomerManager();
customerManager.add(new FileLogger());
	}

}
