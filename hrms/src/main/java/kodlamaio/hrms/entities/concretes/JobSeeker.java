package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_seekers")
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{

	@NotNull
	@Column(name= "first_name")
	private String firstName;
	
	@NotNull
	@Column(name= "last_name")
	private String lastName;
	
	@NotNull
	@Column(name= "national_id")
	private String nationalId;
	
	@NotNull
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;

	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Link> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Experience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<CoverLetter> coverLetters;	

	@JsonIgnore
	@OneToOne(mappedBy = "jobSeeker", optional=false, fetch=FetchType.LAZY)
	private Image image;
	
}
