package adapter;

/**
 * 
 * �൱�� ( user / ps2 ) ת����
 * @author Administrator
 *
 */
public class Adapter2 implements Target {

	Adaptee apdaptee;
	
	@Override
	public void handlerReq() {
		apdaptee.handleReq();
	}
	
	public Adapter2(Adaptee adaptee){
		super();
		this.apdaptee = adaptee;
	}

}
