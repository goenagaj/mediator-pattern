public class Driver {

    public static void main (String[] args) {
        System.out.println("\n:::: AIR TRAFFIC CONTROL SYSTEM ::::\n");

        AirTrafficControl airTrafficControl = new AirTrafficControl();
        Airplane bluePlane = new Airplane(airTrafficControl, "BluePlane");
        Airplane redPlane = new Airplane(airTrafficControl, "RedPlane");
        Airplane greenPlane = new Airplane(airTrafficControl, "GreenPlane");

        bluePlane.takeoff();
        bluePlane.fly();

        greenPlane.takeoff();
        greenPlane.fly();

        bluePlane.land();

        redPlane.takeoff();
        redPlane.fly();

        greenPlane.land();
        redPlane.land();

        bluePlane.maintenance();
    }
}
