import java.util.ArrayList;

public class ATCMediator
    {
        private ArrayList<Flight> flights;
        private Runway runway;
        private boolean landingStatus;

        public ATCMediator() {
            this.flights = new ArrayList<>();
        }

        public void registerRunway(Runway runway)
        {
            this.runway = runway;
        }

        public void registerFlight(Flight flight)
        {
            this.flights.add(flight);
        }

        public boolean isLandingStatus()
        {
            return landingStatus;
        }

        public void setLandingStatus(boolean status)
        {
            landingStatus = status;
        }
    }
