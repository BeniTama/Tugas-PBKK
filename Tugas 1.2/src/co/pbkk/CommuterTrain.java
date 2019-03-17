package co.pbkk;

public class CommuterTrain implements Driver {

	private String name;
	
	public void drive (String destination) {
		System.out.println("Passenger delivered to " + destination);
	}
	
	public CommuterTrain() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
