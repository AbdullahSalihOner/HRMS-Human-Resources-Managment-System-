package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{
	Experience getById(int id);
	List<Experience> getAllByJobSeeker_idOrderByEndAtDesc(int id);
	List<Experience> getAllByJobSeeker_id(int id);
	
}
