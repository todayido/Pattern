package factory.simple;

/*
 * 没有工厂的情况下
 */
public class Client01 {
	public static void main(String[] args) {
		Car car1 = new Audi();
		Car car2 = new BYD();
		
		car1.run();
		car2.run();
		
		
	}
}
