package Business.abstracts;

import java.util.List;

import Entites.concretes.User;

public interface UserService {

	void add(User user) throws InterruptedException;
	void delete(User user);
	void update(User user);
	User getUser(String mail);
	List<User> getAll();
	
}
