package singleton;

public class Client {

	public static void main(String[] args) {
		SingletonDemo sd = SingletonDemo.getInstance();
		SingletonDemo sd2 = SingletonDemo.getInstance();
		System.out.println(sd==sd2);// true
	}
}
