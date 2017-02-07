package adapter;

/**
 * 
 * 相当于 ( user / ps2 ) 转换器
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
