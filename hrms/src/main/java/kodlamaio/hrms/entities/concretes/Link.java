package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="cv_links")
@NoArgsConstructor
@AllArgsConstructor
public class Link extends Base{
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "url")
	private String url;	
	
	@ManyToOne()	 
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
}