package kodlamaio.hrms.core.verification;

public interface VerificationService {
	
	void sendVerificationCode(String email);
	
	String sendCode();
}
