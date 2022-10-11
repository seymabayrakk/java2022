package oopWeekThree.dataAccess;

import oopWeekThree.entities.Edicator;

public class HibernateEdicatorDao implements EdicatorDao {
	public void add(Edicator edicator) {
		System.out.println("Hibernate  ile veritabanına eklendi.");
	}
}
