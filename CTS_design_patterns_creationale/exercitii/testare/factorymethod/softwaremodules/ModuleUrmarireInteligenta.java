package exercitii.testare.factorymethod.softwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModule;
import exercitii.testare.factorymethod.contracts.Module;

public class ModuleUrmarireInteligenta extends AbstractModule implements Module {
    ModuleUrmarireInteligenta(){
        name = "Urmarire inteligenta";
        description = "...";
        price = 120;
    };

    @Override
    public void connect() {
        System.out.println("Modulul: " + name + "; pret: " + price);
    }
}
