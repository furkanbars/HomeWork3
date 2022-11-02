package kodlama.io.Demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Demo.entities.concretes.Category;

public class DatabaseCategory {
	private List<Category> categories;
	
	public DatabaseCategory() {
		this.categories=new ArrayList<Category>();
		this.categories.add(new Category(1,"Backend Programlama","Backend Programlama Öğreniyoruz"));
		this.categories.add(new Category(2,"Frontend Programlama","Frontend Programlama Öğreniyoruz"));
	}
	
	public boolean add(Category category) {
		return this.categories.add(category) ? true : false;
	}
	public List<Category> getAll(){
		return this.categories;
	}
	public Category getById(int id) {
		for(Category category:categories) {
			if (category.getId()==id) {
				return category;
			}
		}
		return null;
	}
}
