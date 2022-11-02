package kodlama.io.Demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Demo.entities.concretes.Course;

public class DatabaseCourse {
	private List<Course> courses;
	public DatabaseCourse() {
		this.courses=new ArrayList<Course>();
		this.courses.add(new Course(1,"C#",1,1,10));
		this.courses.add(new Course(2,"Java",1,1,15));
	}
	public boolean add(Course course) {
		return this.courses.add(course) ? true : false;
	}
	public List<Course> getAll(){
		return this.courses;
	}
	public Course getById(int id) {
		for(Course course:courses) {
			if (course.getId()==id) {
				return course;
			}
		}
		return null;
	}
}
