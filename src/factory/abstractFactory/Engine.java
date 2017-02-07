package factory.abstractFactory;

public interface Engine {
	void run();
	void start();
}


class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑的快");
	}

	@Override
	public void start() {
		System.out.println("舒服");
	}
	
}

class LowEngine implements Engine{
	
	@Override
	public void run() {
		System.out.println("杞殑鎱紒");
	}
	
	@Override
	public void start() {
		System.out.println("鍚姩鎱�");
	}
	
}