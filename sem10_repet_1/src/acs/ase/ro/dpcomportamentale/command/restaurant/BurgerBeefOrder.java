package acs.ase.ro.dpcomportamentale.command.restaurant;

public class BurgerBeefOrder implements FoodOrder{
    private Chef chef;

    public BurgerBeefOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void prepare() {
        chef.makeBurgerBeef();
    }
}
