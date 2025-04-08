package exercitii.testare.factorymethod.softwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModule;
import exercitii.testare.factorymethod.contracts.Module;

public class ModuleVedereTimpDeNoapte extends AbstractModule implements Module {
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
