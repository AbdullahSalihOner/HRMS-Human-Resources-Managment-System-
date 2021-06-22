package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;


public interface UserService {

	DataResult<List<User>> getAll();
	DataResult<User> getById(int id);
	DataResult<User> getUserByEmail(String email);
	Result add(User user);
	Result delete(int id);
	Result update(User user);
}
