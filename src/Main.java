//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drone heavyDrone1 = new HeavyDrone();
        Drone lightDrone1 = new LightDrone();

        heavyDrone1.setStatus("In a flight");

        System.out.println(heavyDrone1.getStatus());
    }
}