package kodlama.io.Demo.dataAccess.concretes.hibernate;

import java.util.List;

import kodlama.io.Demo.dataAccess.abstracts.CategoryDao;
import kodlama.io.Demo.dataAccess.concretes.DatabaseCategory;
import kodlama.io.Demo.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao{

	private DatabaseCategory categories;
	
	public HibernateCategoryDao() {
		categories=new DatabaseCategory();
	}
	
	@Override
	public void add(Category category) {
		if (this.categories.add(category)) {
			System.out.println(category.getName()+" Hibernate kullanılarak veri tabanına eklenmiştir.");
			return;
		}
	}

	@Override
	public List<Category> getAll() {
		return this.categories.getAll();
	}

	@Override
	public Category getById(int id) {
		return this.categories.getById(id);
	}

}
