package com.keshav.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hNo;
	private String city,state;
	
	@ManyToMany
	private List<Employee>employee;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + ", state=" + state + "]";
	} 
	
	
}
