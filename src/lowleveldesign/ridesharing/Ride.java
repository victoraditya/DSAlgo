package lowleveldesign.ridesharing;

public class Ride {
    int id;
    int origin;
    int destination;
    int noOfSeats;
    RIDESTATUS ridestatus;

    public RIDESTATUS getRidestatus() {
        return ridestatus;
    }

    public void setRidestatus(RIDESTATUS ridestatus) {
        this.ridestatus = ridestatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Ride(int origin, int destination, int noOfSeats) {
        this.origin = origin;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int calculateFare(){
        return destination- origin;
    }
}

