package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologiesService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.entities.concretes.Technologies;

@RestController
@RequestMapping("/api//technologies")
public class TechnologiesController {

	private TechnologiesService technologiesService;

	@Autowired
	public TechnologiesController(TechnologiesService technologiesService) {
		super();
		this.technologiesService = technologiesService;
	}

	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return technologiesService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologiesService.add(createTechnologyRequest);
	}

	@DeleteMapping("/delete")
	public void delete(CreateTechnologyRequest createTechnologyRequest) {
		technologiesService.delete(createTechnologyRequest);
	}

	@PutMapping("/update")
	public void update(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologiesService.update(createTechnologyRequest);
	}

	@PutMapping("/{programminglanguage_id}/technologies")
	Technologies technologies(@PathVariable int Language_id) {
		return technologies(Language_id);
	}

	@GetMapping("/findbyid")
	public void findById(CreateTechnologyRequest id) {
		return;
	}

}
