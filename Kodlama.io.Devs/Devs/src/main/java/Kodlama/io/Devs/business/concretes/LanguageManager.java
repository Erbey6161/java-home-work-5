package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequests;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {

		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> languageResponse = new ArrayList<GetAllLanguageResponse>();

		for (Language language : languages) {
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());

			languageResponse.add(responseItem);

		}
		return languageResponse;
	}

	@Override
	public void add(CreateLanguageRequests createLanguageRequests) {
		Language language = new Language();
		language.setName(createLanguageRequests.getName());
		this.languageRepository.save(language);

	}

	@Override
	public void delete(CreateLanguageRequests createLanguageRequests) {
		Language language = new Language();
		language.setName(createLanguageRequests.getName());
		this.languageRepository.delete(language);

	}

	@Override
	public void update(CreateLanguageRequests createLanguageRequests) {
		Language language = new Language();
		language.setName(createLanguageRequests.getName());
		this.languageRepository.save(language);

	}

	@SuppressWarnings("deprecation")
	public Language findById(int id) {
		return languageRepository.getById(id);
	}

}
