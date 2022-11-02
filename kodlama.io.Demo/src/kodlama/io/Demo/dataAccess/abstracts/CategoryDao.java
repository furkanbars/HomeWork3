package kodlama.io.Demo.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Demo.entities.concretes.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();
	Category getById(int id);
}
