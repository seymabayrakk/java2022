package oopWeekThree;

import java.util.ArrayList;
import java.util.List;

import oopWeekThree.business.CategoryManager;
import oopWeekThree.business.CourseManager;
import oopWeekThree.business.EdicatorManager;
import oopWeekThree.core.logging.DatabaseLogger;
import oopWeekThree.core.logging.FileLogger;
import oopWeekThree.core.logging.Logger;
import oopWeekThree.core.logging.MailLogger;
import oopWeekThree.dataAccess.HibernateEdicatorDao;
import oopWeekThree.dataAccess.JdbcCategoryDao;
import oopWeekThree.dataAccess.JdbcCourseDao;
import oopWeekThree.entities.Category;
import oopWeekThree.entities.Course;
import oopWeekThree.entities.Edicator;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category1 = new Category(1, "Yazılım");
		List<Category> categoryDb = new ArrayList<Category>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryDb);
		categoryManager.add(category1);

		Course course1 = new Course(1, "C++", 1000);
		Course course2 = new Course(1, "C#", 1000);
		List<Course> courseDb = new ArrayList<Course>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		
		Edicator edicator1 = new Edicator(1, "Engin", "Demiroğ");
		EdicatorManager edicatorManager = new EdicatorManager(new HibernateEdicatorDao(), loggers);
		edicatorManager.add(edicator1);

		
	}

}
