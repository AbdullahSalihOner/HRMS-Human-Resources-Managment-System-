package kodlamaio.hrms.core.utilities.adapters;

public interface UserValidateService {

	boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth);
}
