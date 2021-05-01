package interfaces;

public class Main {

	public static void main(String[] args) {
		
Logger[] loggers = {new SmsLogger(), new DatabaseLogger(), new FileLogger()};
CustomerManager customerManager = new CustomerManager(loggers);
Customer mehmet = new Customer(1,"Mehmet","aysal");
customerManager.add(mehmet);
	}

}
