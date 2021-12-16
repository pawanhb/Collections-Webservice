package com.besugey.collection.loan;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanWebService {

	private final LoanRepository repository;
	
	public LoanWebService(LoanRepository repository) {
		this.repository = repository;
	}
	
	/**
	 * Fetch all loans (dashbord)
	 * @return
	 */
	@GetMapping("/loans")
	List<Loan> all(){
		return repository.findAll();
	}
	
	/**
	 * Fetch a loan or emi detail
	 * @param id
	 * @return
	 */
	@GetMapping("/loans/{id}")
	Loan one(@PathVariable long id) {
		return repository.findById(id).orElseThrow(() -> new LoanNotFoundException(id));
	}
}
