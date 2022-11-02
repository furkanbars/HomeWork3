package kodlama.io.Demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Demo.entities.concretes.Teacher;

public class DatabaseTeacher {
	private List<Teacher> teachers;
	public DatabaseTeacher() {
		this.teachers=new ArrayList<>();
		this.teachers.add(new Teacher(1,"Engin","Demiroğ","Something"));
		this.teachers.add(new Teacher(2,"Ali","Yıldırım","Something"));
	}
	public boolean add(Teacher teacher) {
		return this.teachers.add(teacher) ? true : false;
	}
	public List<Teacher> getAll(){
		return this.teachers;
	}
	public Teacher getById(int id) {
		for(Teacher teacher:teachers) {
			if (teacher.getId()==id) {
				return teacher;
			}
		}
		return null;
	}
}
