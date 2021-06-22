package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employers")
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User{

	@NotBlank
	@Column(name= "company_name")
	private String companyName;
	
	@NotBlank
	@Column(name= "website")
	private String website;
	
	@NotBlank
	@Column(name= "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified=false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
}
