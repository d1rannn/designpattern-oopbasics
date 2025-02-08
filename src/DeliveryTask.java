public class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.getStatus().equals("IDLE") && drone.isloadedCargo(cargo.getWeight())) {
            assignedDrone = drone;
            drone.setStatus("IN_FLIGHT");
            return true;
        }
        return false;
    }

    public void completeDelivery() {
        assignedDrone.unloadCargo();
        assignedDrone.setStatus("IDLE");
        System.out.println("Delivery completed!");
    }

    public CelestialBody getOrigin() {
        return origin;
    }

    public void setOrigin(CelestialBody origin) {
        this.origin = origin;
    }

    public CelestialBody getDestination() {
        return destination;
    }

    public void setDestination(CelestialBody destination) {
        this.destination = destination;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Drone getAssignedDrone() {
        return assignedDrone;
    }

    public void setAssignedDrone(Drone assignedDrone) {
        this.assignedDrone = assignedDrone;
    }
}