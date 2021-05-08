package day5LayeredArchitecture.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
	
import day5LayeredArchitecture.dataAccess.abstracts.UserDao;
import day5LayeredArchitecture.entities.concretes.User;

public class HybernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFisrtName() + " "+ user.getLastName() +" " + "Hybernate veritabanýna kaydedildi");
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream().filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFisrtName(user.getFisrtName());
		
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		
		System.out.println(user.getFisrtName() + " "+ user.getLastName() +" " + "Hybernate veritabanýnda güncellendi");
	}

	@Override
	public void delete(User user) {
users.remove(user);
System.out.println(user.getFisrtName() + " "+ user.getLastName() +" " + "Hybernate veritabanýndan silindi");

	}

	@Override
	public User getById(int id) {
for(User user: users) {
	if(user.getId()==id) {
		return user;
	}
}

return null;
	}
	
	

	@Override
	public User getbyEmail(String email) {
		
		for (User user:users) {
			
			if(user.getEmail()==email)
				return user;
			
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		
		return users;
	}

}
