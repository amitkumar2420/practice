package defaultStaticmethods;

interface Vehicle{
	String getBrand();
	String speedUp();
	default String turnAlarmOn() {
		return "turning vehiclr";
	}
	default String turnAlarmOff() {
		return "turning off";
	}
	static String getCompany() {
		return "Suzuki";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BBb";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "speeding up";
	}
	
}
public class defaultDemo {
  public static void main(String[] args) {
	Car car=new Car();
	car.getBrand();
	car.speedUp();
	
	//automatically available
	System.out.println(car.turnAlarmOn());
	car.turnAlarmOff();
	
	//calling static methods
	System.out.println(Vehicle.getCompany());
  }
}
