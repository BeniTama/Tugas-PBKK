package co.pbkk;

public class ExpressTrain implements Driver{

	private String name;
	
	@Override
	public void drive(String destination) {
		System.out.println("Passenger brought to " + destination);
	}
}
