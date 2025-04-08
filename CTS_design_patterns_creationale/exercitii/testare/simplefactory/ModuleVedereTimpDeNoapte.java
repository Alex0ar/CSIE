package exercitii.testare.simplefactory;

public class ModuleVedereTimpDeNoapte extends AbstractModule implements RestApi{
    ModuleVedereTimpDeNoapte(){
        name = "Vedere de noapte";
        description = "...";
        price = 220;
    }

    @Override
    public void connect() {
        System.out.println("Modulul: " + name + "; pret: " + price);
    }
}
