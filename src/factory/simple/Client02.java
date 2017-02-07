package factory.simple;

public class Client02 {
	public static void main(String[] args) {
		Car car1 = CarFactory.createCar("°ÂµÏ");
		Car car2 = CarFactory.createCar("±ÈÑÇµÏ");
		
		car1.run();
		car2.run();
		
	}
}
