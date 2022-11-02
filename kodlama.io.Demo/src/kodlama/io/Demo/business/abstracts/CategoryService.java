package kodlama.io.Demo.business.abstracts;

import java.util.List;

import kodlama.io.Demo.entities.concretes.Category;

public interface CategoryService {
	void add(Category category);
	List<Category> getAll();
	Category getById(int id);
}
