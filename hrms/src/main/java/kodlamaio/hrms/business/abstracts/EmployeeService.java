package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();
	DataResult<Employee> getById(int id);
    Result add(Employee employee);
    Result delete(int id);
    Result update(Employee employee);
}
