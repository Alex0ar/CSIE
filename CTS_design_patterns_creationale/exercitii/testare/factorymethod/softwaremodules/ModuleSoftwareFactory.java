package exercitii.testare.factorymethod.softwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModuleFactory;
import exercitii.testare.factorymethod.contracts.Module;
import exercitii.testare.factorymethod.ModuleType;

public class ModuleSoftwareFactory implements AbstractModuleFactory {
    @Override
    public Module getModule(ModuleType moduleType) {
        switch (moduleType){
            case URMARIREINTELIGENTA -> {return new ModuleUrmarireInteligenta();}
            case VEDERETIMPDENOAPTE -> {return new ModuleVedereTimpDeNoapte();}
            default -> throw new IllegalArgumentException();
        }
    }
}
