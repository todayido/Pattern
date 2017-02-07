package factory.abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("跑得快");
	}
	
}
class LowSeat implements Seat {

	@Override
	public void massage() {
		System.out.println("舒服");
	}
	
}
