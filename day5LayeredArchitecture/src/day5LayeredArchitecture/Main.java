package day5LayeredArchitecture;

import day5LayeredArchitecture.business.abstracts.UserService;
import day5LayeredArchitecture.business.concretes.UserManager;
import day5LayeredArchitecture.core.LoginByGoogleManagerAdapter;
import day5LayeredArchitecture.dataAccess.concretes.HybernateUserDao;
import day5LayeredArchitecture.entities.concretes.User;
public class Main {

	public static void main(String[] args) {
		

 UserService userService = new UserManager(new HybernateUserDao(), new LoginByGoogleManagerAdapter());
 
 User user = new User(2, "Mehmet", "AYSAL", "mhmtaysal@gmail.com", "sasaass");
 User user2 = new User(2, "Engin", "Demiroğ", "mhmtaysal@gmail.com", "231586hb");
 userService.add(user);
 userService.add(user2); 
  
;
	
	
	
		
	}
}