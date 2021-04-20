import java.util.ArrayList;

public class AirTrafficControl {

    private ArrayList<Airplane> airplanes;

    public AirTrafficControl() {
        this.airplanes = new ArrayList<>();
    }

    public void register(Airplane airplane) {
        airplanes.add(airplane);
    }

    public void notifyAll(Airplane sender, String message) {
        for (Airplane a : airplanes) {
            if (a != sender) {
                a.recieveMessage(sender.name, message);
            }
        }
    }
}
