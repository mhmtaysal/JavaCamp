package homeWorkInterihance;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println( user.getName() + " Kullan�c�s� Eklendi");
	}
	
	
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			addUser(user);
		}
	}
	
	

}
