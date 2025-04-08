package exercitii.testare.simplefactory;

public class ModuleGpsTracker extends AbstractModule implements RestApi{
    ModuleGpsTracker(){
        name = "GPS tracker";
        description = "...";
        price = 230;
    }

    @Override
    public void connect() {
        System.out.println("Modulul: " + name + "; pret: " + price);
    }
}
