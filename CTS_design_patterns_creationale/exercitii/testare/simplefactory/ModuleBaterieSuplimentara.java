package exercitii.testare.simplefactory;

public class ModuleBaterieSuplimentara extends AbstractModule implements RestApi{
    ModuleBaterieSuplimentara(){
        name = "Bat supl";
        description = "...";
        price = 120;
    };

    @Override
    public void connect() {
        System.out.println("Modulul: " + name + "; pret: " + price);
    }
}
