package oopWeekThree.dataAccess;

import oopWeekThree.entities.Edicator;

public class JdbcEdicatorDao implements EdicatorDao{
	public void add(Edicator edicator) {
		System.out.println("Jdbc ile veritabanına eklendi.");
	}
}
