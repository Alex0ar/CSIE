package acs.ase.ro.dpstructurale.adapter;

public class TicketingObjectAdapter implements AbstractTrainTicketingSystem{
    private AbstractBusTicketingSystem ticketingSystem;

    public TicketingObjectAdapter(AbstractBusTicketingSystem ticketingSystem){
        this.ticketingSystem = ticketingSystem;
    }

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        ticketingSystem.reserve();
    }
}
