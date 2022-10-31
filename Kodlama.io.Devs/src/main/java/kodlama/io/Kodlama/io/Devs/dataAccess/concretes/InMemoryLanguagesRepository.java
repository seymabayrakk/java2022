package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Repository
//data access nesnesi
public class InMemoryLanguagesRepository implements LanguagesRepository{
 
	List <ProgrammingLanguages> languages;
	
	public InMemoryLanguagesRepository() {
		languages=new ArrayList<ProgrammingLanguages>();
		languages.add(new ProgrammingLanguages(1,"C#"));
		languages.add(new ProgrammingLanguages(2,"Java"));
		languages.add(new ProgrammingLanguages(3,"Python"));
	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		
		
		return languages;
	}

	@Override
	public void add(ProgrammingLanguages programmingLanguages) {
		
		languages.add(programmingLanguages);
	}

	@Override
	public void delete(ProgrammingLanguages programmingLanguages) {
		ProgrammingLanguages deleteLanguage=null;
		for(int i=0;i<languages.size();i++) {
			if (programmingLanguages.getId() == languages.get(i).getId()) {
				deleteLanguage = languages.get(i);
			}
		}
		languages.remove(deleteLanguage);
	}

	@Override
	public void update(ProgrammingLanguages programmingLanguages) {
		ProgrammingLanguages updateLanguage=null;
		for(int i=0;i<languages.size();i++) {
			if (programmingLanguages.getId() == languages.get(i).getId()) {
				updateLanguage = languages.get(i);
			}
			}
		updateLanguage.setId( programmingLanguages.getId());
		updateLanguage.setName(programmingLanguages.getName());
		
	}

	@Override
	public ProgrammingLanguages getById(int Id) {
		for(int i=0; i<languages.size();i++) {
			if(languages.get(i).getId()==Id) {
				return languages.get(i);
			}
		}
		return null;
	}

	

}
