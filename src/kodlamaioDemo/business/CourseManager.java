package kodlamaioDemo.business;

import kodlamaioDemo.cor.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao[] _coursesDao;
	private Logger[] _loggers;
	
	public CourseManager(CourseDao[] coursesDao,Logger[] loggers)
	{
		_coursesDao=coursesDao;
		_loggers=loggers;
		
	}
	public void courseAdd(Course course) throws Exception
	{
		System.out.println("Egitim Adi : "+course.getCourseName());
		if(course.getUnitPrice()< 0	)
		{
			throw new Exception("Urun Fiyati 0'dan kucuk olamaz");
			
		}
		
			if(course.getCourseName()=="adsada")
		{
			throw new Exception("Urun ismi tekrar edemez");
		}	
		
		
		
		for(CourseDao coursDao : _coursesDao)
		{
			coursDao.add(course);
		}
		for(Logger logger : _loggers)
		{
			logger.log(course.getCourseName());
		}
	}
}
