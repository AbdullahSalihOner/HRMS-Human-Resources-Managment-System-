package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Experience;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.Image;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.Link;
import kodlamaio.hrms.entities.concretes.Skill;
import kodlamaio.hrms.entities.concretes.School;

public class CVDto {

	public JobSeeker jobseeker;
	public List<School> schools;
	public List<Skill> skills;
	public List<Link> links;
	public List<Language> languages;
	public List<Experience> experiences;
	public Image image;
}
