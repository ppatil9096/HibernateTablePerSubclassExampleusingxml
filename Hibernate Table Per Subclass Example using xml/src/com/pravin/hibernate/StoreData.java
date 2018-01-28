package com.pravin.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();
	Employee employee1 = new Employee();
	employee1.setName("pravin");
	Regular_Employee employee2 = new Regular_Employee();
	employee2.setName("Arya");
	employee2.setBonus(50);
	employee2.setSalary(100000);
	Contract_Employee employee3 = new Contract_Employee();
	employee3.setName("Jignesh");
	employee3.setPay_per_hour(30000);
	employee3.setContract_duration("30 hr");

	session.persist(employee1);
	session.persist(employee2);
	session.persist(employee3);

	transaction.commit();
	session.close();
	System.out.println("Success!");

    }
}
