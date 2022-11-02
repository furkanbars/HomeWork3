package kodlama.io.Demo.dataAccess.concretes.hibernate;

import java.util.List;

import kodlama.io.Demo.dataAccess.abstracts.TeacherDao;
import kodlama.io.Demo.dataAccess.concretes.DatabaseTeacher;
import kodlama.io.Demo.entities.concretes.Teacher;

public class HibernateTeacherDao implements TeacherDao {
	
	private DatabaseTeacher teachers;
	
	public HibernateTeacherDao() {
		this.teachers=new DatabaseTeacher();
	}

	@Override
	public void add(Teacher teacher) {
		if (this.teachers.add(teacher)) {
			System.out.println(teacher.getFirstName()+" "+teacher.getLastName()+" Hibernate kullanılarak veri tabanına eklendi.");
			return;
		}
	}

	@Override
	public List<Teacher> getAll() {
		return this.teachers.getAll();
	}

	@Override
	public Teacher getById(int id) {
		return this.teachers.getById(id);
	}

}
