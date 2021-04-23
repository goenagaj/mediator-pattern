public class Runway {
    private ATCMediator atcMediator;

    public Runway(ATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    public void isClear(boolean status) {
        if (status) {
            System.out.println("Runway Is Clear For Landing.");
        } else {
            System.out.println("Runway Is Not Clear For Landing.");
        }
        atcMediator.setLandingStatus(status);
    }
}

