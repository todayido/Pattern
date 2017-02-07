package builder;

public interface AirshipBuilder {
	OrbitalModule buildOrbitalModule();
	Engine buildEngine();
	EscapeTower buildEscapeTower();
}
