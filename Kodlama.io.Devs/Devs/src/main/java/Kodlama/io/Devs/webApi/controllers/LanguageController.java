package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequests;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateLanguageRequests createLanguageRequests) throws Exception {
		languageService.add(createLanguageRequests);
	}
	@DeleteMapping("/delete")
	public void delete(CreateLanguageRequests createLanguageRequest) {
		languageService.delete(createLanguageRequest);
	}

	@PutMapping("/update")
	public void update(CreateLanguageRequests createLanguageRequest) throws Exception {
		languageService.update(createLanguageRequest);
	}

	@GetMapping("/findbyid")
	public void finddById(CreateLanguageRequests id) {
		return;
	}

}
