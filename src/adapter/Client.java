package adapter;

public class Client {

	public void test(Target t){
		t.handlerReq();
	}
	
	public static void main(String[] args) {
		
//		Target t = new Adapter(); // ֱ�ӵ���ת�����Ϳ���ʹ����������
//		Client c = new Client();
//		c.test(t);
		
		Adaptee adaptee =  new Adaptee(); 
		
		Target t = new Adapter2(adaptee); // ֱ�ӵ���ת�����Ϳ���ʹ����������
		Client c = new Client();
		c.test(t);
		
	}
}
