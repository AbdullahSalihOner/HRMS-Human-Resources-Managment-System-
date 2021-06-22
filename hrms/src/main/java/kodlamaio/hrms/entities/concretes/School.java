package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="cv_schools")
@NoArgsConstructor
@AllArgsConstructor
public class School extends Base{

	
	@Column(name = "school_id")
	private String schoolId;
	
	@Column(name = "department_id")
	private String departmentId;
	
	@Column(name = "start_year")
	@NotNull
	private LocalDate startYear;

	@Column(name = "finish_year",nullable=true)
	private LocalDate finishYear;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;

	 @ManyToOne()	 
	 @JoinColumn(name = "jobseeker_id")
	 private JobSeeker jobSeeker;
}
