package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@RestController
//bilgilendirme.Spring framework uygulamayı derlediğinde erişim noktası olduğunu belirtir.
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguagesService languagesService;
	@Autowired
	public LanguagesController(LanguagesService languagesService) {
		
		this.languagesService = languagesService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguages> getAll(){
		return languagesService.getAll();
	}
	@PostMapping("/add")
	void add(ProgrammingLanguages programmingLanguages) throws Exception
	{
		languagesService.add(programmingLanguages);
	}
	@DeleteMapping
	void delete(ProgrammingLanguages programmingLanguages) {
		languagesService.delete(programmingLanguages);
	}
	@PutMapping
	void update(ProgrammingLanguages programmingLanguages) {
		languagesService.update(programmingLanguages);
	}
	@GetMapping
	ProgrammingLanguages getById(int Id) {
		return languagesService.getById(Id);
	}
	

}	

