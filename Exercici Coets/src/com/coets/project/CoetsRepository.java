package com.coets.project;

import java.util.List;

public class CoetsRepository {
	private List<Coets> coets;

	public CoetsRepository(List<Coets> coets) {
		this.coets = coets;
	}

	public List<Coets> getCoets() {
		return coets;
	}

	public void setCoets(List<Coets> coets) {
		this.coets = coets;
	}

	public void addCoets(Coets coet) {
		coets.add(coet);
	}

	public Object getCoet(String datos_introducidos_cohete2) {
		
		return null;
	}
}


