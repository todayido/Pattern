package singleton;

public class ClientEnum {

	public static void main(String[] args) {
		SingletonEnum s = SingletonEnum.INSTANCE;
		SingletonEnum s2 = SingletonEnum.INSTANCE;
		System.out.println(s==s2);// true
	}
}
