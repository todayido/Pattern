package factory.simple;

/*
 * û�й����������
 */
public class Client01 {
	public static void main(String[] args) {
		Car car1 = new Audi();
		Car car2 = new BYD();
		
		car1.run();
		car2.run();
		
		
	}
}
