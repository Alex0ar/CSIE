package acs.ase.ro.dpstructurale.adapter;

public class BusTicketingSystem implements AbstractBusTicketingSystem{
    public static final int NO_OF_SEATS = 50;

    private int reservedSeats = 0;

    @Override
    public void reserve() {
        if(reservedSeats < NO_OF_SEATS){
            System.out.println("Seat reserved!");
        } else {
            System.out.println("Buss is full!");
        }
    }
}
