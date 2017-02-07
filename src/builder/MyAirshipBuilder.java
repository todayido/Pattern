package builder;

public class MyAirshipBuilder implements AirshipBuilder{

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("BuildOrbitalModule");
		return new OrbitalModule("my buildOrbitalModule..."); // 此处可以和 单例模式 工厂模式 公用
	}

	@Override
	public Engine buildEngine() {
		System.out.println("Engine");
		return new Engine("my Engine...");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("EscapeTower");
		return new EscapeTower("my EscapeTower...");
	}

	
}
