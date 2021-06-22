package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {

	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school){
		return this.schoolService.add(school);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody School school){
		return this.schoolService.update(school);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.schoolService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<School> getById(@RequestParam int id){
		return this.schoolService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	
	@GetMapping("/getAllByJobSeekerIdOrderByEndAtDesc")
	public DataResult<List<School>> getAllByJobSeekerIdOrderByEndAtDesc(@RequestParam int id){
		return this.schoolService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<School>> getAllByJobSeekerId(@RequestParam int id){
		return this.schoolService.getAllByJobSeekerId(id);
	}
}
