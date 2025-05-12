package acs.ase.ro.dpstructurale.adapter;

public class TrainTicketingSystem implements AbstractTrainTicketingSystem{
    public static final int NO_OF_VAGONS = 5;
    public static final int NO_OF_SEATS_PER_VAGON = 100;

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        boolean isWagonValid = wagonNo > 0 && wagonNo <= NO_OF_VAGONS;
        boolean isSeatValid = seatNo > 0 && seatNo <= NO_OF_SEATS_PER_VAGON;

        if(isSeatValid && isWagonValid){
            System.out.println("Ticket issued for wagon " + wagonNo + " and seat " + seatNo);
        }
    }
}
