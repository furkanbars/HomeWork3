package kodlama.io.Demo.business.concretes;

import java.util.List;

import kodlama.io.Demo.business.abstracts.TeacherService;
import kodlama.io.Demo.core.logging.ILogger;
import kodlama.io.Demo.dataAccess.abstracts.TeacherDao;
import kodlama.io.Demo.entities.concretes.Teacher;

public class TeacherManager implements TeacherService{

	private TeacherDao teacherDao;
	private ILogger logger;
	
	public TeacherManager(TeacherDao teacherDao,ILogger logger) {
		this.teacherDao = teacherDao;
		this.logger=logger;
	}
	
	@Override
	public void add(Teacher teacher) {
		if(this.isExist(teacher.getFirstName(), teacher.getLastName())) {
			System.out.println("Bu isim ve soyisimde zaten eğitici mevcut.");
			return;
		}
		this.teacherDao.add(teacher);
		this.logger.log("Eğitici eklendi.");
	}

	@Override
	public List<Teacher> getAll() {
		List<Teacher> teachers = this.teacherDao.getAll();
		this.logger.log("Eğiticiler listelendi.");
		return teachers;
	}

	@Override
	public Teacher getById(int id) {
		Teacher teacher = this.teacherDao.getById(id);
		this.logger.log("Eğitici idsine göre Eğitici getirildi.");
		return teacher;
	}
	
	private boolean isExist(String firstName,String lastName) {
		for(Teacher myTeacher:this.getAll()) {
			if(myTeacher.getFirstName().toUpperCase().equalsIgnoreCase(firstName) &&
					myTeacher.getLastName().toUpperCase().equalsIgnoreCase(lastName)) {
				return true;
			}
		}
		return false;
	}

}
