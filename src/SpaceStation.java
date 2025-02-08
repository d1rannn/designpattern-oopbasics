public class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, double x, double y, int stationLevel) {
        super(name, x, y);
        this.stationLevel = stationLevel;
    }

    @Override
    public void displayDetails() {
        System.out.println("Space Station: " + getName() + " Station Level: " + stationLevel);
    }
}
