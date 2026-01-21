package com.keshav.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
  
@Entity(name="empp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column(name = "e_Name")
	private String name;
	private String gender; 
	private int salary;
//	@Transient
//	private String country;

	@OneToOne
	@JoinColumn(name = "add_id") //to change the provided default name(that is address_hNo)
	private Address address;
	
	public Employee() {
		super();
	}


//	public Employee(int id, String name, String gender, int salary) {
//	public Employee(String name, String gender, int salary,String country) {
	public Employee(String name, String gender, int salary) {
//		super();
//		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
//		this.country=country;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}


}
