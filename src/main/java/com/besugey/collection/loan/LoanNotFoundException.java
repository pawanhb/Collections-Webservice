package com.besugey.collection.loan;

public class LoanNotFoundException extends RuntimeException {

	LoanNotFoundException(Long id){
		super("Could not find agent " + id);
	}
}
