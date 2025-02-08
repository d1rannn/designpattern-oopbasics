public class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, double x, double y, String atmosphereType) {
        super(name, x, y);
        this.atmosphereType = atmosphereType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Planet: " + getName() +
                ", Atmosphere: " + atmosphereType);
    }

    public String getAtmosphereType() {
        return atmosphereType;
    }

    public void setAtmosphereType(String atmosphereType) {
        this.atmosphereType = atmosphereType;
    }
}
