package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Transmission {

	private int maxWeight;
	private int stability;
	private Struct struct;

	public Transmission(int maxWeight, int stability) {
		this.maxWeight = maxWeight;
		this.stability = stability;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public int getStability() {
		return stability;
	}
	
	public Struct getStruct() {
		return struct;
	}

	@Autowired
	public void setStruct(Struct struct) {
		this.struct=struct;
	}

}