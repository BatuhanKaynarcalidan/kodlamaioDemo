package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.cor.logging.DatabaseLogger;
import kodlamaioDemo.cor.logging.FileLogger;
import kodlamaioDemo.cor.logging.Logger;
import kodlamaioDemo.cor.logging.MailLogger;
import kodlamaioDemo.cor.logging.SmsLogger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(1, "Programlama");
		Course course1 = new Course(1,"Java",100);
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		
		Logger[] loggers = {new FileLogger(),new DatabaseLogger(),new SmsLogger(),new MailLogger()};
		CourseDao[] coursesDao = {new HibernateCourseDao(),new JdbcCourseDao()};
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.categoryAdd(category1);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.instructorAdd(instructor1);
		CourseManager courseManager = new CourseManager(coursesDao, loggers);
		courseManager.courseAdd(course1);
		
		
	}

}
