/*****************************************************************************
 * Copyright 2021 Besugey
 ****************************************************************************/
package com.besugey.collection.agent;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AgentWebService {
	
	private final AgentRepository repository;
	
	AgentWebService(AgentRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/agents")
	List<Agent> all(){
		return repository.findAll();
	}
	
	
	@PostMapping("/agents")
	Agent newAgent(@RequestBody Agent newAgent){
		
		return repository.save(newAgent);
		
	}
	
	@GetMapping("/agents/{id}")
	Agent one(@PathVariable long id) {
		return repository.findById(id).orElseThrow(() -> new AgentNotFoundException(id));
	}
	
	@DeleteMapping("/agents/{id}")
	void deleteAgent(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
