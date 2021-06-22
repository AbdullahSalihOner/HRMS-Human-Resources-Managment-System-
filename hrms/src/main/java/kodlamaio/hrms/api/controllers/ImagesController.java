package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Image;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageService imageService;
	private JobSeekerService jobSeekerService;
	

	@Autowired
	public ImagesController(ImageService imageService, JobSeekerService jobSeekerService) {
		super();
		this.imageService = imageService;
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		JobSeeker jobSeeker = this.jobSeekerService.getById(id).getData();
		Image image = new Image();
		image.setJobSeeker(jobSeeker);
		return this.imageService.add(image, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Image image){
		return this.imageService.update(image);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.imageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Image> getById(@RequestParam("id") int id){
		return this.imageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	
	@GetMapping("/getByJobSeekerId")
	public DataResult<Image> getByJobSeekerId(@RequestParam int id){
		return this.imageService.getByJobSeekerId(id);
	}
}
