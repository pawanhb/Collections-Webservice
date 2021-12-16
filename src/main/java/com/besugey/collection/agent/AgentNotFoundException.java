/*****************************************************************************
 * Copyright 2021 Besugey
 ****************************************************************************/
package com.besugey.collection.agent;

class AgentNotFoundException extends RuntimeException {

	AgentNotFoundException(Long id){
		super("Could not find agent " + id);
	}
}
