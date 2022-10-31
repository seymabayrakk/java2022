package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Service
public interface LanguagesService {
	void add(ProgrammingLanguages programmingLanguages) throws Exception;
	void delete(ProgrammingLanguages programmingLanguages);
	void update(ProgrammingLanguages programmingLanguages);
	List <ProgrammingLanguages> getAll();
	ProgrammingLanguages getById(int Id);
}
