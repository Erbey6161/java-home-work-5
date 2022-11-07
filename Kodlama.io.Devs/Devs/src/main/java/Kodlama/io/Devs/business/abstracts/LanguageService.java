package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateLanguageRequests;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();
	Language findById(int id);
	
	void add(CreateLanguageRequests createLanguageRequests)throws Exception;
	void delete(CreateLanguageRequests createLanguageRequests);
	void update(CreateLanguageRequests createLanguageRequests)throws Exception;
}
