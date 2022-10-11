package oopWeekThree.dataAccess;

import oopWeekThree.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
public void add(Category category) {
	System.out.println("Jdbc ile veritabanına eklendi.");
}
}
