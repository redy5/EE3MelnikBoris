package com.mycompany.app;

public class Passanger {

	private String line;
	private String name;
	private int age;

	public Passanger(String line, String name, int age) {
		this.line = line;
		this.name = name;
		this.age = age;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
