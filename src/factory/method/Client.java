package factory.method;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new AudiFactory().createCar();
		Car car2 = new BYDFactory().createCar();
		
		car1.run();
		car2.run();
	}

}
