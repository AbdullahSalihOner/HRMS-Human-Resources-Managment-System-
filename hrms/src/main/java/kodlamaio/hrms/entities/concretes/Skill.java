package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "cv_skills")
@NoArgsConstructor
@AllArgsConstructor
public class Skill extends Base{

	
	@Column(name = "skill_name")
	private String skillName;
	
	@ManyToOne()	 
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
}