package com.keshav.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Address;
import com.keshav.entity.Employee;
 
public class EmployeeRunner{
	
	public static void main(String[] args) {
		
//		Employee emp1 = new Employee();
//		emp1.setName("Vinay");
//		emp1.setGender("Male");
//		emp1.setSalary(40000);
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Mohit");
//		emp2.setGender("Male");
//		emp2.setSalary(50000);
//		
//		Employee emp3 = new Employee();
//		emp3.setName("Akash");
//		emp3.setGender("Male");
//		emp3.setSalary(60000);
//		
//		Address add1 = new Address();
//		add1.setCity("Noida");
//		add1.setState("UP");
//		
//		Address add2 = new Address();
//		add2.setCity("GZB");
//		add2.setState("UP");
//		
//		Address add3 = new Address();
//		add3.setCity("Lucknow");
//		add3.setState("UP");
//		
//		
//		ArrayList<Address> listofAddresses = new ArrayList<>();
//		listofAddresses.add(add1);
//		listofAddresses.add(add2);
//		listofAddresses.add(add3);
//		
//		emp1.setAddresses(listofAddresses);
//		emp1.setAddresses(listofAddresses);
//		emp1.setAddresses(listofAddresses);
//		
//		ArrayList<Employee> listofEmployees = new ArrayList<>();
//		listofEmployees.add(emp1);
//		listofEmployees.add(emp2);
//		listofEmployees.add(emp3);
//
//		add1.setEmployee(listofEmployees);
//		add2.setEmployee(listofEmployees);
//		add3.setEmployee(listofEmployees);
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
		
//		tx.commit();
		
//		Employee employee = session.find(Employee.class, 3);
//		System.out.println(employee);
//		System.out.println(employee.getAddresses());
		
		Address address = session.find(Address.class, 2);
		System.out.println(address);
		System.out.println(address.getEmployee());
	}
}