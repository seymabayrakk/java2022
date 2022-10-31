package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
@Service
public class LanguagesManager implements LanguagesService {
	
	private LanguagesRepository languagesRepository;
	
	public LanguagesManager(LanguagesRepository languagesRepository) {
		
		this.languagesRepository = languagesRepository;
	}

	@Override
	public List<ProgrammingLanguages> getAll() {

		
		
		return languagesRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguages programmingLanguages) throws Exception {
	if(!programmingLanguages.getName().isEmpty()) {
		for(int i=0; i<languagesRepository.getAll().size();i++) {
			if(languagesRepository.getAll().get(i).getName().equalsIgnoreCase(programmingLanguages.getName())) {
				throw new Exception("Programlama dili tekrar edemez...");
			}
		}
		languagesRepository.add(programmingLanguages);
		
	}
	else {
		throw new Exception("Programlama dili boş geçilemez...");
	}
	
		
	}

	@Override
	public void delete(ProgrammingLanguages programmingLanguages) {
		languagesRepository.delete(programmingLanguages);
		
		
	}

	@Override
	public void update(ProgrammingLanguages programmingLanguages) {
		languagesRepository.update(programmingLanguages);
		
	}

	@Override
	public ProgrammingLanguages getById(int Id) {
		// TODO Auto-generated method stub
		return languagesRepository.getById(Id) ;
	}

	
}
