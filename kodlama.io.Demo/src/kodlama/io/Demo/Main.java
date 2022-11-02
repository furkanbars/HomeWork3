package kodlama.io.Demo;

import java.util.List;

import kodlama.io.Demo.business.abstracts.CategoryService;
import kodlama.io.Demo.business.abstracts.CourseService;
import kodlama.io.Demo.business.abstracts.TeacherService;
import kodlama.io.Demo.business.concretes.CategoryManager;
import kodlama.io.Demo.business.concretes.CourseManager;
import kodlama.io.Demo.business.concretes.TeacherManager;
import kodlama.io.Demo.core.logging.Logger;
import kodlama.io.Demo.dataAccess.concretes.hibernate.HibernateTeacherDao;
import kodlama.io.Demo.dataAccess.concretes.jdbc.JdbcCategoryDao;
import kodlama.io.Demo.dataAccess.concretes.jdbc.JdbcCourseDao;
import kodlama.io.Demo.dataAccess.concretes.jdbc.JdbcTeacherDao;
import kodlama.io.Demo.entities.concretes.Category;
import kodlama.io.Demo.entities.concretes.Course;
import kodlama.io.Demo.entities.concretes.Teacher;

public class Main {

	public static void main(String[] args) {
		CategoryService categoryService = new CategoryManager(new JdbcCategoryDao(),new Logger());
		List<Category> categories = categoryService.getAll();
		for(Category category:categories) {
			System.out.println(category.getName());
		}
		categoryService.add(new Category(3,"Mobil Uygulama","Açıklama"));
		
		TeacherService teacherService = new TeacherManager(new JdbcTeacherDao(),new Logger());
		List<Teacher> teachers=teacherService.getAll();
		for(Teacher teacher:teachers) {
			System.out.println(teacher.getFirstName()+" "+teacher.getLastName());
		}
		teacherService.add(new Teacher(3,"Abdullah","Barış","Bandırma"));
		
		CourseService courseService = new CourseManager(new JdbcCourseDao(),new Logger());
		courseService.add(new Course(3,"JavaSciript",1,1,15));
	}
}
