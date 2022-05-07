package lowleveldesign.ridesharing;/*
package lowleveldesign.ridesharing;

import java.util.List;

public class Rider extends Person{
    Ride currentRide;
    String name;
    List<Ride> completedRides;

   public Rider(String name){
       super(name);
    }

    public Rider(String name,Ride ride) {
        this.currentRide = ride;
        this.name=name;
    }

    public void createRide(int id, int origin, int dest, int seats){
       if(origin>dest) {
           System.out.println("Wrong values");
           return;
       }
       currentRide.setId(id);
       currentRide.setOrigin(origin);
       currentRide.setNoOfSeats(seats);
       currentRide.setDestination(dest);
       currentRide.setRidestatus(RIDESTATUS.CREATED);

    }

    public void updateRide(int id, int origin, int dest, int seats){
        if(currentRide.getRidestatus().equals(RIDESTATUS.WITHDRAWN)) {
            System.out.println("Can't update as withdrawn already.");
            return;
        }
        if(currentRide.getRidestatus().equals(RIDESTATUS.COMPLETED)) {
            System.out.println("Can't update as completed already.");
            return;
        }
        currentRide.setId(id);
        currentRide.setOrigin(origin);
        currentRide.setNoOfSeats(seats);
        currentRide.setDestination(dest);
        currentRide.setRidestatus(RIDESTATUS.CREATED);

        createRide(id,origin,dest,seats);

    }
    public updateRide(int )
    public withdrawRide(int )


}
*/
