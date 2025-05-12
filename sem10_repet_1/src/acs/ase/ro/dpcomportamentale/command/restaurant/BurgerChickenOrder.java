package acs.ase.ro.dpcomportamentale.command.restaurant;

public class BurgerChickenOrder implements FoodOrder{
    private Chef chef;

    public BurgerChickenOrder(Chef chef){
        this.chef = chef;
    }

    @Override
    public void prepare() {
        chef.makeBurgerChicken();
    }
}
