package com.nep.onlinelesson.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	private int id;
	
	@NotNull
	@Column(columnDefinition="char(9)",unique=true)
	private String icNumber;
	
	@NotNull
	private String name;
	
	@NotNull
	@Column(columnDefinition="double(7,2)")
	private double salary;
	
	@NotNull
	@Column(columnDefinition = "date")
	private Calendar startDate;
	
	
	
	public Employee () {}



	public Employee(int id, @NotNull String icNumber, @NotNull String name, @NotNull double salary,
			@NotNull Calendar startDate) {
		this.id = id;
		this.icNumber = icNumber;
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getIcNumber() {
		return icNumber;
	}



	public void setIcNumber(String icNumber) {
		this.icNumber = icNumber;
	}



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



	public Calendar getStartDate() {
		return startDate;
	}



	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
