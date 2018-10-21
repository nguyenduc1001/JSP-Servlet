package com.duc;

public class Employpee {
public Employpee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
private String name;
private double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double raiseSalary(int boi)
{
	return salary*boi;
}
}
