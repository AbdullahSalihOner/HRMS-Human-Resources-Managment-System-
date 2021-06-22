package kodlamaio.hrms.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService{

	@Override
	public void sendVerificationCode(String email) { //CerenBdk dan aldım çok teşekkürler herşey için.
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Please click on the link to verify your account:  " + verificationLink );
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		return verificationCode;
	}

}
