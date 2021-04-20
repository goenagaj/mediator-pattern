public class Airplane {

    AirTrafficControl airTrafficControl;
    String name;

    public Airplane(AirTrafficControl airTrafficControl, String name) {
        this.airTrafficControl = airTrafficControl;
        this.name = name;

        airTrafficControl.register(this);
    }

    public void takeoff() {
        airTrafficControl.notifyAll(this, "is taking off.");
    }

    public void fly() {
        airTrafficControl.notifyAll(this, "is flying.");
    }

    public void land() {
        airTrafficControl.notifyAll(this, "is landing.");
    }

    public void emergency() {
        airTrafficControl.notifyAll(this, "is having an emergency.");
    }

    public void maintenance() {
        airTrafficControl.notifyAll(this, "is undergoing maintenance.");
    }

    public void recieveMessage(String senderName, String message) {
        System.out.println("Hello " + this.name + " :: " + senderName + " " + message);
    }
}
