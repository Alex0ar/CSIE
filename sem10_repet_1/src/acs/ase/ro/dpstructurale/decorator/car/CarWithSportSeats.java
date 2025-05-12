    package acs.ase.ro.dpstructurale.decorator.car;

    public class CarWithSportSeats extends CarDecorator{
        private String seatsProducer;

        public CarWithSportSeats(Vehicul vehicul) {
            super(vehicul);
        }

        public String getSeatsProducer() {
            return seatsProducer;
        }

        public void setSeatsProducer(String seatsProducer) {
            this.seatsProducer = seatsProducer;
        }
    }
