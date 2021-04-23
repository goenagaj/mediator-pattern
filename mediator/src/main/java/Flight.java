public class Flight {
    private ATCMediator atcMediator;

    public Flight(ATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
    }

    public void land()
    {
        if (atcMediator.isLandingStatus())
        {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(false);
        }
        else
            System.out.println("Waiting for landing.");
    }

    public void takeoff()
    {
        System.out.println("Taking Off.");
        atcMediator.setLandingStatus(true);
    }

    public void getReady()
    {
        System.out.println("Ready for landing.");
    }

}

