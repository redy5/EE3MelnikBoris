package com.mycompany.app;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private Engine engine;
	private Transmission transmission;
	private List<Passanger> passangers;

	public Car(Transmission transmission) {
		this.transmission = transmission;
	}

	public void start() {
		System.out.println("Car started with engine power " + engine.getPower() + " Newtons,volume " + engine.getVolume()
				+ " liters,mass " + engine.getMass() + " kilos.");
		System.out.println("Its transmission endures maximum weight of " + transmission.getMaxWeight()
				+ " kilos and has a stability rating " + transmission.getStability()+" and some autowired value - "+transmission.getStruct().getVal());
	}

	public void encounterDanger() {
		System.out.println("Car encountered danger! Passengers' thoughts are:");
		for (int i =0;i<passangers.size();i++) {
			Passanger p = passangers.get(i);
			System.out.println(p.getAge() + " years old, name " + p.getName() + ",says \"" + p.getLine() + "\'");
		}
	}

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Collection<Passanger> getPassangers() {
		return passangers;
	}

	public void setPassangers(List<Passanger> passangers) {
		this.passangers = passangers;
	}
}