package kodlama.io.Demo.entities.concretes;

public class Course {
	private int id;
	private String name;
	private int teacherId;
	private int categoryId;	
	private double price;
	public Course() {
		super();
	}
	public Course(int id, String name, int teacherId, int categoryId, double price) {
		super();
		this.id = id;
		this.name = name;
		this.teacherId = teacherId;
		this.categoryId = categoryId;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
