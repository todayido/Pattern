package singleton;

public class SingletonDemo {

	// ��ʼ��ʱ�������أ��������ʱ��ֱ�ӳ�ʼ������Ȼ���̰߳�ȫ
	private static /*fina*/ SingletonDemo instance = new SingletonDemo();
	
	//˽�й���������ֹ�ⲿ����
	private SingletonDemo(){};
	
	// ����û��ͬ��������Ч�ʸ�
	public static SingletonDemo getInstance(){
		return instance;
	}
	
}
