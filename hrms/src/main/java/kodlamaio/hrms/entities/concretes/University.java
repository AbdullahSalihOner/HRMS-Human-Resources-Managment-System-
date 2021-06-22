package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "universities")
public class University {

	@Id 
	@Column(name="id")
	private int id;
	
	@NotBlank
	@Column(name = "name")
	private String name;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="status")
	private int status;
	
}
