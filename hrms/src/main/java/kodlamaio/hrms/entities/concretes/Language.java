package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "cv_languages")
@NoArgsConstructor
@AllArgsConstructor
public class Language extends Base{
	
	
	@JoinColumn(name = "language_id")
	@NotNull
	@ManyToOne
	private Language language;

	
	@Min(1)
	@Max(5)
	@NotNull
	@Column(name = "level")
	private short level;
	
	@ManyToOne()	 
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;

	
}