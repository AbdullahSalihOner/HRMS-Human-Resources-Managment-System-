package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>>  getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}

	@Override
	public Result add(JobPosition jobPosition) {///buraya iş kuralını ekle
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Job position has been added.");
	}

	@Override
	public DataResult<JobPosition> getJobByPosition(String position) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByJobPosition(position));
		
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		jobPositionDao.delete(jobPosition);
        return new SuccessResult("Silindi.");
	}


	@Override
	public Result update(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
        return new SuccessResult("Güncellendi.");
	}

	@Override
	public DataResult<JobPosition> get(int id) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findById(id).get());
	}

}
