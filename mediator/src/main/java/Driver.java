public class Driver {

    public static void main(String args[]) {

        ATCMediator atcMediator = new ATCMediator();

        Flight sparrow101 = new Flight(atcMediator);
        Flight sparrow111 = new Flight(atcMediator);

        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(sparrow101);
        atcMediator.registerFlight(sparrow111);
        atcMediator.registerRunway(mainRunway);

        sparrow101.getReady();
        mainRunway.isClear(true);
        sparrow101.land();

        sparrow111.getReady();
        sparrow111.land();

        sparrow111.takeoff();
        sparrow111.getReady();
        sparrow111.land();
    }
}
