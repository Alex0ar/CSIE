package acs.ase.ro.dpstructurale.decorator.car;

public class CarWithAlart extends CarDecorator{
    public CarWithAlart(Vehicul vehicul) {
        super(vehicul);
    }

    public void activateAlart(){
        System.out.println("Alarm is activated!");
    }

    @Override
    public void stop(){
        super.stop();
        activateAlart();
    }
}
