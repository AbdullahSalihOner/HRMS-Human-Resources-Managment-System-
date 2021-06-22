package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;


@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User Added");
	}

	@Override
	public DataResult<User> getById(int id) {
		return new SuccessDataResult<User>(this.userDao.getById(id));
	}


	@Override
	public Result delete(int id) {
		this.userDao.deleteById(id);
		return new SuccessResult("User Deleted");
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
        return new SuccessResult("User Updated");
	}

}
