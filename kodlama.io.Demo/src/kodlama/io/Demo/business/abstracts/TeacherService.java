package kodlama.io.Demo.business.abstracts;

import java.util.List;

import kodlama.io.Demo.entities.concretes.Teacher;

public interface TeacherService {
	void add(Teacher teacher);
	List<Teacher> getAll();
	Teacher getById(int id);
}
