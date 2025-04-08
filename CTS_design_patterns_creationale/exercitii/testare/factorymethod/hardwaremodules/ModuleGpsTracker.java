package exercitii.testare.factorymethod.hardwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModule;
import exercitii.testare.factorymethod.contracts.Module;

public class ModuleGpsTracker extends AbstractModule implements Module {
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
