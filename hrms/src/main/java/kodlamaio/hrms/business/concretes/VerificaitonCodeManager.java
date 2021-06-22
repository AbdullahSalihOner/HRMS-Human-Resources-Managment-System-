package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationCodeDao;
import kodlamaio.hrms.entities.concretes.VerificationCode;

@Service
public class VerificaitonCodeManager implements VerificationCodeService{

	private VerificationCodeDao verificationCodeDao;
	
	public VerificaitonCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code added");
	}

	@Override
	public Result delete(VerificationCode code) {
		this.verificationCodeDao.delete(code);
		return new SuccessResult("Code delete");
	}

	@Override
	public Result update(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code Update");
	}

	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
	}

}
