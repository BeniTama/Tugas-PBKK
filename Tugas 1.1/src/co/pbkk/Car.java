package co.pbkk;

public class Car {

	int id;
	String brand;
	String condition;
	String model;
	
	public Car() {
		
	}
	
	public Car(int id, String brand, String condition, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.condition = condition;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", condition=" + condition + ", model=" + model + "]";
	}
	
	
}
