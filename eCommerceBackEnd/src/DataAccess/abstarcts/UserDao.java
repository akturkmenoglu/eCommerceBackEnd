package DataAccess.abstarcts;

import java.util.List;

import Entites.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(String email);
	List<User> getAll();
	
}
