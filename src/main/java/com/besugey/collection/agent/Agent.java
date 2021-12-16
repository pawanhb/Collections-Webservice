/*****************************************************************************
 * Copyright 2021 Besugey
 ****************************************************************************/
package com.besugey.collection.agent;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agent {

	private @Id @GeneratedValue Long id;
	private String name;
	
	public Agent() {}
	
	public Agent(String name){
		this.name = name;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
		      return true;
		    if (!(o instanceof Agent))
		      return false;
		    Agent agent = (Agent) o;
		    return Objects.equals(this.id, agent.id) && Objects.equals(this.name, agent.name);
		        
	}
	
	@Override
	  public String toString() {
	    return "Agent{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
	  }
	
}
