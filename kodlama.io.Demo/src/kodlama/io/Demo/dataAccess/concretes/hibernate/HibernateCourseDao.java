package kodlama.io.Demo.dataAccess.concretes.hibernate;

import java.util.List;

import kodlama.io.Demo.dataAccess.abstracts.CourseDao;
import kodlama.io.Demo.dataAccess.concretes.DatabaseCourse;
import kodlama.io.Demo.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{
	
	private DatabaseCourse courses;
	
	public HibernateCourseDao() {
		this.courses=new DatabaseCourse();
	}
	
	@Override
	public void add(Course course) {
		if (this.courses.add(course)) {
			System.out.println(course.getName()+" Hibernate kullanılarak veri tabanına eklendi.");
		}
	}

	@Override
	public List<Course> getAll() {
		return this.courses.getAll();
	}

	@Override
	public Course getById(int id) {
		return this.courses.getById(id);
	}

}
