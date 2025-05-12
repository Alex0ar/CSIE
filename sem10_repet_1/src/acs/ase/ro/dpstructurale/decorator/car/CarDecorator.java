package acs.ase.ro.dpstructurale.decorator.car;

public abstract class CarDecorator implements Vehicul {
    private Vehicul vehicul;

    public CarDecorator(Vehicul vehicul) {
        this.vehicul = vehicul;
    }

    @Override
    public void start(){
        vehicul.start();
    }

    @Override
    public void stop(){
        vehicul.stop();
    }
}
