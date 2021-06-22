package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "cv_images")
@NoArgsConstructor
@AllArgsConstructor
public class Image extends Base{

	
	@Column(name = "url")
	@NotNull
	private String url;
	
	
	 @OneToOne()	 
	 @JoinColumn(name = "jobseeker_id",referencedColumnName="user_id")
	 private JobSeeker jobSeeker;

}
