package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "cv_cover_letters")
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetter extends Base {
	
	@NotBlank
	@Column(name = "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")	
	private JobSeeker jobSeeker;
	

	public CoverLetter(String content, int jobseekerId) {
		super();
		this.content = content;
		this.jobSeeker.setId(jobseekerId);
	}

	
	
}