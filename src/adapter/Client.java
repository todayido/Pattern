package adapter;

public class Client {

	public void test(Target t){
		t.handlerReq();
	}
	
	public static void main(String[] args) {
		
//		Target t = new Adapter(); // 直接调用转换器就可以使用适配器了
//		Client c = new Client();
//		c.test(t);
		
		Adaptee adaptee =  new Adaptee(); 
		
		Target t = new Adapter2(adaptee); // 直接调用转换器就可以使用适配器了
		Client c = new Client();
		c.test(t);
		
	}
}
