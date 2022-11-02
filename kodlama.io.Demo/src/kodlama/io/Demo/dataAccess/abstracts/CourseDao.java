package kodlama.io.Demo.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Demo.entities.concretes.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
	Course getById(int id);
}
