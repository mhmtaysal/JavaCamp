package day5LayeredArchitecture.business.abstracts;

import day5LayeredArchitecture.entities.concretes.User;

import java.util.List;

public interface UserService {
	

	boolean add(User user);
	boolean update(User user);
	boolean delete(User user);
	User getById(int id);
	User getByEmail(String email);
	List<User> getAll();
	
	

}
