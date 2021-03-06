package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	
	private SkillService skillService;

	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skill){
		return this.skillService.add(skill);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Skill skill){
		return this.skillService.update(skill);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.skillService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Skill> getById(@RequestParam("id") int id){
		return this.skillService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Skill>> getAll(){
		return this.skillService.getAll();
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<Skill>> getAllByJobSeekerId(@RequestParam int id){
		return this.skillService.getAllByJobSeekerId(id);
	}
}
