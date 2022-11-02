package kodlama.io.Demo.business.concretes;

import java.util.List;

import kodlama.io.Demo.business.abstracts.CourseService;
import kodlama.io.Demo.core.logging.ILogger;
import kodlama.io.Demo.dataAccess.abstracts.CourseDao;
import kodlama.io.Demo.entities.concretes.Course;

public class CourseManager implements CourseService{

	private CourseDao courseDao;
	private ILogger logger;
	
	public CourseManager(CourseDao courseDao,ILogger logger) {
		this.courseDao=courseDao;
		this.logger=logger;
	}
	
	@Override
	public void add(Course course) {
		if (this.isExist(course.getName())) {
			System.out.println("Kurs ismi zaten mevcut");
			return;
		}
		if (this.biggerThanZero(course.getPrice())) {
			System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
			return;
		}
		this.courseDao.add(course);
		this.logger.log("Kurs eklendi.");
	}

	@Override
	public List<Course> getAll() {
		List<Course> courses = this.courseDao.getAll();
		this.logger.log("Kurslar listelendi.");
		return courses;
	}

	@Override
	public Course getById(int id) {
		Course course = this.courseDao.getById(id);
		this.logger.log("Kurs idsine göre Kurs getirildi.");
		return course;
	}
	private boolean isExist(String courseName) {
		for(Course course:this.getAll()) {
			if (course.getName().toUpperCase().equalsIgnoreCase(courseName)) {
				return true;
			}
		}
		return false;
	}
	private boolean biggerThanZero(double price) {
		if (price<0) {
			return true;
		}
		return false;
	}
	
}
