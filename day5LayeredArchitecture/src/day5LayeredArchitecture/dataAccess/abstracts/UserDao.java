package day5LayeredArchitecture.dataAccess.abstracts;



import java.util.List;

import day5LayeredArchitecture.entities.concretes.User;

public interface UserDao {
 public void add(User user);
 public void update(User user);
 public void delete(User user);
 
 User getById(int id);
 User getbyEmail(String email);
 List<User> getAll();
 
}
