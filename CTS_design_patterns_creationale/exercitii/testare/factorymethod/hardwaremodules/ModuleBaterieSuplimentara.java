package exercitii.testare.factorymethod.hardwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModule;
import exercitii.testare.factorymethod.contracts.Module;

public class ModuleBaterieSuplimentara extends AbstractModule implements Module {
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
