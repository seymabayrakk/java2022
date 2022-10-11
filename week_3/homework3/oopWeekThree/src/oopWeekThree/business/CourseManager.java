package oopWeekThree.business;

import java.util.List;

import oopWeekThree.core.logging.Logger;
import oopWeekThree.dataAccess.CourseDao;
import oopWeekThree.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
		for (Course cour : courses) {
			if (cour.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz.");
			}

		}

		courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());

		}
	}
}
