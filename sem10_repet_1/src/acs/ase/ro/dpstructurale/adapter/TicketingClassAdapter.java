package acs.ase.ro.dpstructurale.adapter;

public class TicketingClassAdapter extends BusTicketingSystem implements AbstractTrainTicketingSystem{
    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        this.reserve();
    }
}
