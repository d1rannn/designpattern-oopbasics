public abstract class CelestialBody {
    private String name;
    private double coordinateX;
    private double coordinateY;

    public CelestialBody(String name, double x, double y) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public abstract void displayDetails();

    public double distanceTo(CelestialBody other) {
        double dx = this.coordinateX - other.coordinateX;
        double dy = this.coordinateY - other.coordinateY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String getName() { return name; }
    public double getCoordinateX() { return coordinateX; }
    public double getCoordinateY() { return coordinateY; }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
}
