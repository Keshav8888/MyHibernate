package com.keshav.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Address;
import com.keshav.entity.Employee;
 
public class EmployeeRunner{
	
	public static void main(String[] args) {
		
//		Employee emp = new Employee("Pintu","Male",40500,"INDIA");
		
//		Employee emp = new Employee("Milan","Male",40500);
//		Address add = new Address("GZB","UP");
		
//		Employee emp = new Employee();
//		emp.setName("Vinay");
//		emp.setGender("Male");
//		emp.setSalary(40000);
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
//		emp.setAddresses(listofAddresses);
		
//      using "Configuration"
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
// 		Configuration single line(Method chaining)
//		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
//		using "StandardServiceRegistry"
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
// 		StandardServiceRegistry single line(Method chaining)
//		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
//		Session session = sessionFactory.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		session.persist(emp);;
//		tx.commit();
		
//		get method(now deprecated)
//		Employee employee = session.get(Employee.class,5);
//		System.out.println(employee);
//		
//		Employee employee = session.get(Employee.class,10);   //it will give null as 10th Object is not found in database
//		System.out.println(employee);
		
		//Now find is used instead of get
//		Employee employee = session.find(Employee.class,10);   //it will give null
//		System.out.println(employee);
		
//		Employee employee = session.find(Employee.class,3);
//		System.out.println(employee);
		
//		load method
//		Employee employee = new Employee();
//		session.load(employee,4);
//		System.out.println(employee);
		
//		session.load(employee,10);   //it will give ObjectNotFoundException as 10th Object is not found in database
//		System.out.println(employee);

		
		// for .java based
		Session session = EmpConfiguration.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		session.persist(emp);
//		tx.commit();
		
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddresses());
	}
}