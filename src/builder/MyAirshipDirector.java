package builder;

public class MyAirshipDirector implements AirshipDirector{

	AirshipBuilder airshipBuilder;
	
	
	
	public MyAirshipDirector(AirshipBuilder airshipBuilder) {
		this.airshipBuilder = airshipBuilder;
	}



	// ◊∞≈‰”Ó÷Ê∑…¥¨∂‘œÛ
	@Override
	public Airship diretorAirship() {
		Engine e = airshipBuilder.buildEngine();
		OrbitalModule om = airshipBuilder.buildOrbitalModule();
		EscapeTower et = airshipBuilder.buildEscapeTower();
		
		Airship airship = new Airship();
		airship.setEngine(e);
		airship.setOrbitalModule(om);
		airship.setEscapeTower(et);
		
		return airship;
	}

}
