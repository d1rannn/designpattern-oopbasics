public class LightDrone extends Drone {

    public LightDrone(String id, double cargoCapacity, int speed) {
        super(id, cargoCapacity, 50);
    }

    public LightDrone() {
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / getSpeed();
    }
}