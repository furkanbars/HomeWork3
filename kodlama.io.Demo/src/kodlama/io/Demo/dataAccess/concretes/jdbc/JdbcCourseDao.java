package kodlama.io.Demo.dataAccess.concretes.jdbc;

import java.util.List;

import kodlama.io.Demo.dataAccess.abstracts.CourseDao;
import kodlama.io.Demo.dataAccess.concretes.DatabaseCourse;
import kodlama.io.Demo.entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{
	private DatabaseCourse courses;
	
	public JdbcCourseDao() {
		this.courses=new DatabaseCourse();
	}
	public void add(Course course) {
		if (this.courses.add(course)) {
			System.out.println(course.getName()+" Jdbc kullanılarak veri tabanına eklendi.");
		}
	}
	public List<Course> getAll(){
		return this.courses.getAll();
	}
	public Course getById(int id) {
		return this.courses.getById(id);
	}
}
