package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Repository
public interface LanguagesRepository {
	
	List <ProgrammingLanguages> getAll();
	//dilleri listeledik
	void add(ProgrammingLanguages programmingLanguages);
	void delete(ProgrammingLanguages programmingLanguages);
	void update(ProgrammingLanguages programmingLanguages);
	ProgrammingLanguages getById(int Id);
	
	
	
}
