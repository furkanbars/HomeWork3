package kodlama.io.Demo.business.abstracts;

import java.util.List;

import kodlama.io.Demo.entities.concretes.Course;

public interface CourseService {
	void add(Course course);
	List<Course> getAll();
	Course getById(int id);
}
