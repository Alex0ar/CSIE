package acs.ase.ro.dpcomportamentale.command.restaurant;

public class PizzaOrder implements FoodOrder{
    private Chef chef;

    public PizzaOrder(Chef chef){
        this.chef = chef;
    }

    @Override
    public void prepare() {
        chef.bakePizza();
    }
}
