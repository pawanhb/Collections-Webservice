/*****************************************************************************
 * Copyright 2021 Besugey
 ****************************************************************************/
package com.besugey.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.besugey.collection.agent.Agent;
import com.besugey.collection.agent.AgentRepository;
import com.besugey.collection.loan.Loan;
import com.besugey.collection.loan.LoanRepository;

@Configuration
class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
//	@Bean
//	  CommandLineRunner initAgent(AgentRepository repository) {
//
//	    return args -> {
//	      log.info("Preloading " + repository.save(new Agent("Dharmesh Kumar")));
//	      log.info("Preloading " + repository.save(new Agent("Rakesh Kumar")));
//	    };
//	  }
//	
//	@Bean
//	 CommandLineRunner initLoan(LoanRepository repository) {
//		return args -> {
//			log.info("Preloading loan" + repository.save(new Loan("000000005","Sreevathsav Gorantla")));
//			log.info("Preloading loan" + repository.save(new Loan("000000006","Prabhu Gowda")));
//		};
//	}
}
