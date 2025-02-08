public class HeavyDrone extends Drone {

    public HeavyDrone(String id, double cargoCapacity, int speed) {
        super(id, cargoCapacity, 100);
    }

    public HeavyDrone() {
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / getSpeed();
    }
}